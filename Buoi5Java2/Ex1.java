package Buoi5Java2;

import java.sql.*;

public class Ex1 {
    public static void main(String[] args) throws SQLException {
          try(
                  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&severTimezone=UTC", "root", "");
                  Statement stmt = conn.createStatement();
          ){

              conn.setAutoCommit(false);
              ResultSet rset = stmt.executeQuery("select id, qty from books where id in (1001, 1002)");
              System.out.println("-- Before UPDATE --");
              while (rset.next()){
                  System.out.println(rset.getInt("id")+ ", " + rset.getInt("qty"));
              }
              conn.commit();

              stmt.executeUpdate("update books set qty = qty +1 where id =1001");
              stmt.executeUpdate("update books set qty = qty +1 where id =1002");
              conn.commit();

              rset = stmt.executeQuery("select id, qty from books where id in (1001, 1002)");
              System.out.println("-- After UPDATE and Commit --");
              while (rset.next()){
                  System.out.println(rset.getInt("id") + ", " + rset.getInt("qty"));
              }
              conn.commit();

              stmt.executeUpdate("update books set qty = qty - 99 where id = 1001");
              stmt.executeUpdate("update books set qty = qty - 99 where id = 1002");
              conn.rollback();

              rset = stmt .executeQuery("select id, qty from books where id in (1001, 1002)");
              System.out.println("-- After UPDATE and Rollback -- ");
              while (rset.next()){
                  System.out.println(rset.getInt("id") + ", " + rset.getInt("qty"));
              }
              conn.commit();
          }catch (SQLException ex){
              ex.printStackTrace();
          }
    }
}

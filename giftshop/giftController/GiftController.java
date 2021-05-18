package giftshop.giftController;


import giftshop.giftModel.Gift;

import java.sql.*;


public class GiftController {
    String url = "jdbc:mysql://localhost:3306/giftshop?allowPublicKeyRetrieval=true&useSSL=false&severTimezone=UTC";
    String username = "root";
    String password = "";

    public void displayGift(){
        try(
                Connection conn = DriverManager.getConnection(url, username, password);
                Statement stmt = conn.createStatement();
                ){
                     String display = "select * from gifts;";
                     ResultSet rset = stmt.executeQuery(display);
                     ResultSetMetaData rsetMD = rset.getMetaData();
                     int numColums = rsetMD.getColumnCount();
                     for(int i = 1; i <= numColums; i++){
                         System.out.printf("%-30s", rsetMD.getColumnName(i));
                     }
                     System.out.println();
                     while (rset.next()){
                         for (int i = 1; i <= numColums; i++){
                             System.out.printf("%-30s", rset.getString(i));
                         }
                         System.out.println();
                     }
                 }catch (SQLException ex){
                     ex.printStackTrace();
                 }
    }

    public boolean insertGift(Gift gift){
        try(
                Connection conn = DriverManager.getConnection(url, username, password);
                Statement stmt = conn.createStatement();
                ){
                     String insert = "insert into gifts(id, name, price, qty) values (" + gift.getId() + ",'" + gift.getName() + "','" + gift.getPrice() + "'," + gift.getQty() + ");";
                     stmt.executeUpdate(insert);
                     System.out.println("Gift has been inserted");
                     return true;
                 }catch (SQLException ex){
                     ex.printStackTrace();
                     return false;
                 }
    }

    public boolean deleteGift (Gift gift){
        try(
                Connection conn = DriverManager.getConnection(url, username, password);
                Statement stmt = conn.createStatement();
                ){
                    String delete = "delete from gifts where id = " + gift.getId();
                    stmt.executeUpdate(delete);
                    System.out.println("Gift has been deleted");
                    return true;
                 }catch (SQLException ex){
                     ex.printStackTrace();
                     return false;
                 }
    }
}

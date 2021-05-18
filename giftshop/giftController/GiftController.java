package giftshop.giftController;


import giftshop.giftModel.Gift;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GiftController {
    String url = "jdbc:mysql://localhost:3306/giftshop?allowPublicKeyRetrieval=true&useSSL=false&severTimezone=UTC";
    String username = "root";
    String password = "";

    List<Gift> GiftList = new ArrayList<>();
    public List<Gift> loading(){
        try(
                Connection conn = DriverManager.getConnection(url, username, password);
                Statement stmt = conn.createStatement();
                ){
                     String select = "select * from gifts";
                     ResultSet rset = stmt.executeQuery(select);
                     while (rset.next()){
                         int id = rset.getInt("id");
                         String name = rset.getString("name");
                         double price = rset.getDouble("price");
                         int qty = rset.getInt("qty");
                         Gift obj = new Gift(id, name, price, qty);
                         GiftList.add(obj);
                     }
                 }catch (SQLException ex){
                    ex.printStackTrace();
                 }
        return GiftList;
    }

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
                     loading();
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
                     loading();
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
                    loading();
                    System.out.println("Gift has been deleted");
                    return true;
                 }catch (SQLException ex){
                     ex.printStackTrace();
                     return false;
                 }
    }
}

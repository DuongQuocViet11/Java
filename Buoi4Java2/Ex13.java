package Buoi4Java2;

import java.sql.*;

public class Ex13 {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&severTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            String strSelect = "select title, author, price, qty from books Where author = 'CodeLean VN' OR price >= 30 ORDER BY price DESC, id ASC";
            System.out.println("The SQL statment is: " + strSelect + "\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount = 0;
            while (rset.next()){
                String title = rset.getString("title");
                String author = rset.getString("author");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(title + ", " + author + ", " + price + ", " + qty);
                ++rowCount;
            }

        }catch (SQLException ex){
            ex.printStackTrace();
        }

    }
}

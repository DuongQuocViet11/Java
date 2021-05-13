package Buoi4Java2;

import java.sql.*;

public class Ex12 {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&severTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){

            String strSelect = "select title, price FROM books WHERE author = 'CodeLean VN'";
            System.out.println("The SQL statment is: " + strSelect + "\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount = 0;
            while (rset.next()){
                String title = rset.getString("title");

                double price = rset.getDouble("price");
                System.out.println( title +  ", " + price );
                ++rowCount;
            }

        }catch (SQLException ex){
            ex.printStackTrace();
        }

    }
}

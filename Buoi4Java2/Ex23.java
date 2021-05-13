package Buoi4Java2;

import java.sql.*;

public class Ex23 {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&severTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strSelect = "select ProductName from products";
            System.out.println("The SQL statment is: " + strSelect + "\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount = 0;
            while (rset.next()) {
                String ProductName = rset.getString("ProductName");
                System.out.println(ProductName);
                ++rowCount;
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}

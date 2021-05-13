package Buoi4Java2;

import java.sql.*;

public class Ex21 {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&severTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strSelect = "select * from customers";
            System.out.println("The SQL statment is: " + strSelect + "\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount = 0;
            while (rset.next()) {
                String CustomerID = rset.getString("CustomerID");
                String CompanyName = rset.getString("CompanyName");
                String ContactName = rset.getString("ContactName");
                String ContactTitle = rset.getString("ContactTitle");
                String Address = rset.getString("Address");
                String City = rset.getString("City");
                String Region = rset.getString("Region");
                String PostalCode = rset.getString("PostalCode");
                String Country = rset.getString("Country");
                String Phone = rset.getString("Phone");
                String Fax = rset.getString("Fax");
                System.out.println(CustomerID + " , " + CompanyName + " , " +
                        ContactName + " , " + ContactTitle + " , " + Address + " , " +
                        City + " , " + Region + " , " + PostalCode + " , " + Country + " , " +
                        Phone + " , " + Fax);
                ++rowCount;
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}


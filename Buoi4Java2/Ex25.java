package Buoi4Java2;

import java.sql.*;


public class Ex25 {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&severTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strSelect = "select * from orders";
            System.out.println("The SQL statment is: " + strSelect + "\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount = 0;
            while (rset.next()) {
                int orderId = rset.getInt("OrderID");
                String customerId = rset.getString("CustomerID");
                int employeeId = rset.getInt("EmployeeID");
                String orderDate = rset.getString("OrderDate");
                String requiredDate = rset.getString("RequiredDate");
                String shipDate = rset.getString("ShipDate");
                String shipName = rset.getString("ShipName");
                String shipAddress = rset.getString("ShipAddress");
                String shipCity = rset.getString("ShipCity");
                String shipCountry = rset.getString("ShipCountry");
                System.out.println(orderId + ", " + customerId + ", " + employeeId + ", " + orderDate + ", " + requiredDate + ", "
                                    + shipDate + ", " + shipName + ", " + shipAddress + ", " + shipCity + ", " + shipCountry);
                ++rowCount;
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}

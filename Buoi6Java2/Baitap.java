package Buoi6Java2;

import java.sql.*;
import java.util.Scanner;

public class Baitap {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/drinklist?allowPublicKeyRetrieval=true&useSSL=false&severTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
                ){
                    Scanner scanner = new Scanner(System.in);
                    int pick = 0;
                    do {
                        System.out.println("--- Favourite Drinks ---");
                        System.out.println("1. Add To the Favourite List");
                        System.out.println("2. Search The Favourite List");
                        System.out.println("3. Display The Favourite List");
                        System.out.println("4. Update The Favourite List");
                        System.out.println("5. Delete The Favourite List");
                        System.out.println("6. Exit");
                        System.out.println("Choose number: ");
                        pick = Integer.parseInt(scanner.nextLine());
                        switch (pick){
                            case 1:
                                System.out.println("Enter id: ");
                                int id1 = Integer.parseInt(scanner.nextLine());
                                System.out.println("Enter name of favourite drinks: ");
                                String name1 = scanner.nextLine();
                                System.out.println("Enter price of favourite drinks: ");
                                double price1 = Double.parseDouble(scanner.nextLine());
                                System.out.println("Enter brand of favourite drinks: ");
                                String brand1 = scanner.nextLine();
                                PreparedStatement pstmt = conn.prepareStatement("insert into favoritedrinks values (?, ?, ?, ?);");
                                pstmt.setInt(1, id1);
                                pstmt.setString(2, name1);
                                pstmt.setDouble(3, price1);
                                pstmt.setString(4, brand1);
                                int rowInserted = pstmt.executeUpdate();
                                System.out.println(rowInserted + " Drinks Added");
                                ResultSet rset = stmt.executeQuery("select * from favoritedrinks ;");
                                ResultSetMetaData rsetMD = rset.getMetaData();
                                int numColumns = rsetMD.getColumnCount();
                                for(int i = 1; i <= numColumns; ++i){
                                    System.out.printf("%-30s", rsetMD.getColumnName(i));
                                }
                                System.out.println();
                                for (int i = 1; i <= numColumns; ++i){
                                    System.out.printf("%-30s", "(" + rsetMD.getColumnClassName(i) + ")");
                                }
                                System.out.println();
                                while (rset.next()){
                                    for (int i = 1; i <= numColumns; ++i){
                                        System.out.printf("%-30s", rset.getString(i));
                                    }
                                    System.out.println();
                                break;
                                }

                            case 2:
                                System.out.println("Enter the name of favourite drinks: ");
                                String name2 = scanner.nextLine();
                                ResultSet rset2 = stmt.executeQuery("select * from favoritedrinks where name = '"+name2+"';");

                                    ResultSetMetaData rset2MD = rset2.getMetaData();
                                    int numColumns2 = rset2MD.getColumnCount();
                                    for (int i =1; i <= numColumns2; ++i){
                                        System.out.printf("%-30s", rset2MD.getColumnName(i));
                                    }
                                    System.out.println();
                                    for (int i= 1; i <= numColumns2; ++i){
                                        System.out.printf("%-30s", "(" + rset2MD.getColumnClassName(i) + ")");
                                    }
                                    System.out.println();
                                    while (rset2.next()) {
                                        for (int i = 1; i <= numColumns2; ++i) {
                                            System.out.printf("%-30s", rset2.getString(i));
                                        }
                                        System.out.println();
                                    }
                                    break;

                            case 3:
                                System.out.println("Favourite List: ");
                                ResultSet rset3 = stmt.executeQuery("select * from favoritedrinks ;");
                                ResultSetMetaData rset3MD = rset3.getMetaData();
                                int numColumns3 = rset3MD.getColumnCount();
                                for(int i = 1; i <= numColumns3; ++i){
                                    System.out.printf("%-30s", rset3MD.getColumnName(i));
                                }
                                System.out.println();
                                for (int i = 1; i <= numColumns3; ++i){
                                    System.out.printf("%-30s", "(" + rset3MD.getColumnClassName(i) + ")");
                                }
                                System.out.println();
                                while (rset3.next()) {
                                    for (int i = 1; i <= numColumns3; ++i) {
                                        System.out.printf("%-30s", rset3.getString(i));
                                    }
                                    System.out.println();
                                }
                                break;

                            case 4:
                                System.out.println("Enter the id you want to update: ");
                                int id3 = Integer.parseInt(scanner.nextLine());
                                System.out.println("Enter name: ");
                                String name3 = scanner.nextLine();
                                System.out.println("Enter the price: ");
                                double price3 = Double.parseDouble(scanner.nextLine());
                                System.out.println("Enter the brand: ");
                                String brand3 = scanner.nextLine();
                                PreparedStatement pstmt2 = conn.prepareStatement("UPDATE favoritedrinks SET name=?, price=?, brand=? WHERE id=?;");
                                conn.setAutoCommit(false);
                                pstmt2.setString(1, name3);
                                pstmt2.setDouble(2, price3);
                                pstmt2.setString(3, brand3);
                                pstmt2.setInt(4, id3);
                                pstmt2.executeUpdate();
                                conn.commit();
                                System.out.println("Successful Update!");
                                break;

                            case 5:
                                System.out.println("Enter the name you want to delete: ");
                                String name4 = scanner.nextLine();
                                PreparedStatement pstmt3 = conn.prepareStatement("Delete from favoritedrinks where name = '"+ name4+"';");
                                pstmt3.executeUpdate();
                                System.out.println("Successful Deleted!");
                                break;
                        }
                    }while (pick<6);
                }catch (SQLException ex){
                       ex.printStackTrace();
                 }
    }
}

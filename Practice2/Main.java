package Practice2;

import java.util.Scanner;
import java.sql.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentList studentList = new StudentList();
    

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int choice =0;
        do {

            System.out.println("=== MENU ===");
            System.out.println("1. Add student records");
            System.out.println("2. Display student records");
            System.out.println("3. Save");
            System.out.println("4. Exit");
            System.out.println("Your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    addNewStudent();
                    break;
                case 2:
                    Display();
                    break;
                case 3:
                    Save(Student);
                    break;
            }
        }while (choice < 4);
    }

    public static void  addNewStudent(){
        System.out.println("Enter student ID: ");
        String studentID = scanner.nextLine();
        System.out.println("Enter student Name: ");
        String studentName = scanner.nextLine();
        System.out.println("Enter student address: ");
        String address = scanner.nextLine();
        System.out.println("Enter student phone: ");
        String phone = scanner.nextLine();
        Student newStudent = Student.createStudent(studentID, studentName, address, phone);
        if(studentList.addNewStudent(newStudent)){
            System.out.println("Added studentID = " + studentID + ", studentName = " + studentName + ", address = " + address + ", phone = " + phone);
        }else {
            System.out.println("Cannot add, " + studentName + " already on file");
        }
    }

    public static void Display(){
        String url = "jdbc:mysql://localhost:3306/school?allowPublicKeyRetrieval=true&useSSL=false&severTimezone=UTC";
        String user = "root";
        String password = "";
        try(
                Connection conn = DriverManager.getConnection(url, user, password);
                Statement stmt = conn.createStatement();
                ){
                    String display = "select * from student;";
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

    public static void Save(Student student){
        String url = "jdbc:mysql://localhost:3306/school?allowPublicKeyRetrieval=true&useSSL=false&severTimezone=UTC";
        String user = "root";
        String password = "";
        try(
                Connection conn = DriverManager.getConnection(url, user, password);
                Statement stmt = conn.createStatement();
                ){
                    String insert = "insert into student values (" + student.getStudentID() + ",'"+ student.getStudentName() +"', '"+ student.getAddress() + "', "+ student.getPhone()+");";
                    stmt.executeUpdate(insert);
                    System.out.println("Student has been saved");

                 }catch (SQLException ex){
                      ex.printStackTrace();

                 }
    }
}

package Practice;

import java.util.Scanner;

public class TestFlight {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int number;
       do {
           System.out.println("Nhap so hieu chuyen bay: ");
            number = scan.nextInt();
       }while (number<0);
           System.out.println("Nhap diem den: ");
        String destination = scan.next();
        Flight g1 = new Flight(number, destination);
        g1.display();
    }
}

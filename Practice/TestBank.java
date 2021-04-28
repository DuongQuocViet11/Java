package Practice;

import java.util.Scanner;

public class TestBank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so tien ban muon vay: ");
        double balance = scan.nextDouble();
        Bank b1 = new Bank(balance, 10);
        System.out.println(b1);
    }
}

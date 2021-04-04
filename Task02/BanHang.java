package Task02;

import java.util.Scanner;

public class BanHang {
    public static void main(String[] args) {
        int priceOfShirt = 300;
        int priceOfTrouser = 700;
        int qtyShirt, qtyTrouser;
        int totalShirt, totalTrouser;
        double discount = 0;
        double net, point;
        System.out.println("Enter the number of Shirts to order:");
        Scanner scan = new Scanner(System.in);
        qtyShirt = scan.nextInt();
        System.out.println("Enter the number of Trouser to order:");
        qtyTrouser = scan.nextInt();

        totalShirt = priceOfShirt * qtyShirt;
        totalTrouser = priceOfTrouser * qtyTrouser;
        System.out.println("Item"+"        "+"Quantity"+"     "+"Price"+"        "+"Total");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Shirt"+"         "+    qtyShirt +"          "+    priceOfShirt+"           "+    totalShirt);
        System.out.println("Trouser"+"       "+    qtyTrouser +"          "+  priceOfTrouser+"           "+    totalTrouser);

        System.out.print("Discount                               ");
        System.out.println((totalShirt+totalTrouser)>3000 ? discount = (totalShirt+totalTrouser)*0.1 : 0);
        System.out.println("-----------------------------------------------------------------------");
        net = totalShirt + totalTrouser - discount;
        System.out.println("Net Total"+"                              "+net);
        System.out.println("-----------------------------------------------------------------------");
        System.out.print("Points Earned         ");
        System.out.println(net>3000 ? point= net/100 : 0 );
        System.out.println("Thank You!");
    }
}

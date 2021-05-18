package giftshop.giftView;

import giftshop.giftController.GiftController;
import giftshop.giftModel.Gift;

import java.util.Scanner;

public class GiftShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to GIFT SHOP!!!");
        System.out.println("======================================");
        int choose;
        do {
            System.out.println("1. Display gifts in shop");
            System.out.println("2. Insert gifts to shop");
            System.out.println("3. Delete gifts in shop");
            System.out.println("4. Exit");
            System.out.println("You choose: ");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    GiftController giftctrl = new GiftController();
                    giftctrl.displayGift();
                    break;
                case 2:
                    addGift();
                    break;
                case 3:
                    delGift();
                    break;

            }
        }while (choose < 4 );
    }

    public static void addGift(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Price:");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter Qty:");
        int qty = Integer.parseInt(scanner.nextLine());
        Gift obj = new Gift(id, name, price, qty);
        GiftController ctrl = new GiftController();
        ctrl.insertGift(obj);
    }

    public static void delGift(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id of gift you want to delete:");
        int id = scanner.nextInt();
        Gift obj = new Gift();
        obj.setId(id);
        GiftController ctrl = new GiftController();
        ctrl.deleteGift(obj);
    }
}

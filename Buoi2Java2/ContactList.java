package Buoi2Java2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactList{
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        List<Contact> contact = new ArrayList<>();
        contact.add(new Contact("Viet", "0941077550"));
        contact.add(new Contact("Tien Thanh","0582233081"));
        contact.add(new Contact("Ba Cuong","0582233082"));
        contact.add(new Contact("Van Thang","0123456789"));
        contact.add(new Contact("Quan","09720179699"));
        public void addContact(){
            System.out.println("Enter new contact name:");
            String n = scan.nextLine();
            System.out.println("Enter phone number:");
            String p = scan.nextLine();
            contact.add(new user(n,p));
            System.out.println("New contact added: name = "+ n + ", phone = "+ p);
        }
    }
}

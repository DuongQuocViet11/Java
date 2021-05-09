package Buoi2Java2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> inte = new ArrayList<>();
        System.out.println("Enter 5 integer values.");
        for (int i=0; i<5;i++){
            int t = scan.nextInt();
            inte.add(t);
        }
        double arg =0;
        for (int i=0; i<5; i++){
            System.out.println("Element " + i + " , typed value was " + inte.get(i));
            arg = (double) (arg+inte.get(i));
        }
        System.out.println("Average is " + (arg/5));
    }
}

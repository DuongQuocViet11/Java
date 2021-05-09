package Buoi2Java2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> temp = new ArrayList<>();
        int day;
        int arg = 0;
        int d = 0;
        System.out.println("How many days' temperature?");
        day = scan.nextInt();
        for (int i = 0; i<day; i++){
            System.out.println("Day " + (i+1) + "'s high temp:" );
            int t = scan.nextInt();
            temp.add(t);
        }
        for (int i = 0; i< temp.size(); i++){
            arg = arg + temp.get(i);
        }
        arg = arg/day;
        for (int i = 0; i < temp.size();i++){
            if(temp.get(i)>arg){
                d++;
            }
        }
        System.out.println("Average = " + arg);
        System.out.println(d + " days above average");
    }
}

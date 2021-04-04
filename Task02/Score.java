package Task02;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        int maths1, maths2;
        int science1, science2;
        int english1, english2;
        int total1, total2;
        int percentage1, percentage2;


        System.out.println("Enter marks obtained in Maths:");
        Scanner scan = new Scanner(System.in);
        maths1 = scan.nextInt();
        System.out.println("Enter marks obtained in Science:");
        science1 = scan.nextInt();
        System.out.println("Enter marks obtained in English:");
        english1 = scan.nextInt();

        System.out.println("\nEnter marks obtained in Maths:");
        maths2 = scan.nextInt();
        System.out.println("Enter marks obtained in Science:");
        science2 = scan.nextInt();
        System.out.println("Enter marks obtained in English:");
        english2 = scan.nextInt();

        System.out.print("\nMarks of Quoc Viet:");
        System.out.print("\nMaths = ");
        System.out.print(maths1);
        System.out.print("\nScience = ");
        System.out.print(science1);
        System.out.print("\nEnglish = ");
        System.out.print(english1);

        System.out.println("\nMarks of Van Thang:");
        System.out.print("Maths = ");
        System.out.print(maths2);
        System.out.print("\nScience = ");
        System.out.print(science2);
        System.out.print("\nEnglish = ");
        System.out.print(english2);

        System.out.print("\n\nTotal marks scored by Quoc Viet = ");
        System.out.print(total1 = maths1 +science1+english1);
        System.out.print("\nPercentage = ");
        System.out.print(percentage1=total1/3);
        System.out.print("%");

        System.out.print("\nTotal marks scored by Van Thang = ");
        System.out.print(total2 = maths2 + science2 + english2);
        System.out.print("\nPercentage = ");
        System.out.print(percentage2 = total2/3);
        System.out.print("%");

        System.out.print("\n\nIs Quoc Viet's percentage lesser than Van Thang?");
        if (percentage1<percentage2){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.print("Is Quoc Viet's percentage greater than Van Thang? ");
        if (percentage1>percentage2){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.print("Quoc Viet's and Van Thang's percentage are equal?");
        if ( percentage1 == percentage2){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        if (percentage1 > 75)
        {
            System.out.println("\nScholarship Amount for Quoc Viet = $20000 ");
        }
        else if ((percentage1>60) && ((percentage1<75) || (percentage1 == 75)))
        {
            System.out.println("\nScholarship Amount for Quoc Viet = $10000 ");
        }

        if (percentage2 > 75)
        {
            System.out.println("\nScholarship Amount for Van Thang = $20000 ");
        }
        else if ((percentage2>60) && ((percentage2<75) || (percentage2 == 75)))
       {
            System.out.println("\nScholarship Amount for Van Thang = $10000 ");
        }
    }
}

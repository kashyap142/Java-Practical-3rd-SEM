package StudentPackage;
import package1.*;

import java.util.Scanner;

class CreditLimitException extends Exception {
    CreditLimitException(String str) {
        super(str);
    }
}

public class StudentRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student1 std1 = new Student1();
        std1.getName();
        std1.getBranch();

        String[] sub = {"Maths", "COA" , "JAVA" , "DSA" , "UHV" , "DMS"};
        int[] credits = new int[sub.length];
        int total_Credit = 0;
        for (int i=0; i<sub.length; i++) {
            System.out.print("Enter credit for " + sub[i] + " :  ");
            credits[i] = sc.nextInt();
            total_Credit += credits[i];
        }

        try {
            if(total_Credit > 30)
                throw new CreditLimitException("Credit limit exceeded from 30");
            } catch(CreditLimitException e) {
            System.out.println(e);
        }
        int obtained_Marks = 0;
        int[] marks = new int[credits.length];
        for (int i=0; i<marks.length; i++ ) {
            System.out.print("Enter marks obtained in " + sub[i] + " : " );
            marks[i] = sc.nextInt();
            obtained_Marks += marks[i];
        }

        float percentage = obtained_Marks / 6.0F;
        float cgpa = percentage / 10;

        std1.display();
        System.out.println("CGPA: " + cgpa);
    }
}

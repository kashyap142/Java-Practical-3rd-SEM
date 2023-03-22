package package1;

import java.util.Scanner;

interface student {
    void getName();
    void getBranch();
    void display();
}

public class Student1 implements student {
    Scanner sc = new Scanner(System.in);
    String name , branch;
    public void getName() {
        System.out.print("Enter Student Name:  ");
        name = sc.nextLine();
    }

    public void getBranch() {
        System.out.print("Enter Branch:  ");
        branch = sc.nextLine();
    }

    public void display() {
        System.out.println("Student name: " + name);
        System.out.println("Student branch: " + branch.toUpperCase());
    }
}

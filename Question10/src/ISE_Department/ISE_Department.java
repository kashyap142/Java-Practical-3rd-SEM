package ISE_Department;
import java.util.Scanner;

interface Department {
    void readData(Faculty f);
    void printData(Faculty f);
}
public class ISE_Department implements Department {
    Scanner sc = new Scanner(System.in);
    public void readData(Faculty f) {
        System.out.print("Enter faculty name: ");
        f.name = sc.next();
        System.out.print("Enter designation: ");
        f.designation = sc.next();
        System.out.print("Enter age of faculty: ");
        f.age = sc.nextInt();

        try {
            if(f.age > 58)
                throw new AgeException("Age shouldn't be more than 58.");
        } catch (AgeException e) {
            System.out.println(e);
        }

        System.out.print("Enter years of experience: ");
        f.years_Of_Experience = sc.nextInt();
        System.out.print("Enter joining date: ");
        f.joining_Date = sc.next();
        System.out.print("Enter subjects handled: ");
        f.subjects_Handled = sc.next();
    }

    public void printData(Faculty f) {
        System.out.println("Faculty name: " + f.name);
        System.out.println("Designation: " + f.designation);
        System.out.println("Age: " + f.age);
        System.out.println("Years of Experience: " + f.years_Of_Experience);
        System.out.println("Joining date: " + f.joining_Date);
        System.out.println("Subjects handled: " + f.subjects_Handled);
    }
}

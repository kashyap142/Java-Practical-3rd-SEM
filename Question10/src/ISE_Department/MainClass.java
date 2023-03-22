package ISE_Department;

class AgeException extends Exception {
    AgeException(String str) {
        super(str);
    }
}

public class MainClass {
    public static void main(String[] args) {
        ISE_Department ise = new ISE_Department();
        Faculty f1 = new Faculty();
        ise.readData(f1);
        ise.printData(f1);

        System.out.println(f1.name);
    }
}

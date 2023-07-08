import java.util.Scanner;

public class Java070802 {
    public static void main(String[] args) {
        System.out.println("welcome to my calculator");
        int opt;
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Divison");
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter Your Calculation Method");
        opt = Scanner.nextInt();

        int a;
        Scanner v1 = new Scanner(System.in);
        System.out.println("Enter Your 1st Value");
        a = v1.nextInt();

        int b;
        Scanner v2 = new Scanner(System.in);
        System.out.println("Enter Your 2nd Value");
        b = v2.nextInt();



        switch(opt) {
            case 1:
                System.out.println("Addition: " +  a+b);
                break;
            case 2:
                System.out.println("Substraction: " + (a-b));
                break;
            case 3:
                System.out.println("Multiplication: " + a*b);
                break;
            case 4:
                System.out.println("Divison: " + a/b);
                break;
            default:
                System.out.println("Wrong Input");
        }

    }
}

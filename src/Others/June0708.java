import java.util.Scanner;

public class June0708 {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator");

        int x;
        Scanner opt = new Scanner(System.in);
        System.out.println("Select Your Type of Calculation");
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for subtraction");
        System.out.println("Press 3 for multiplication");
        System.out.println("Press 4 for division");
        System.out.println("Press 5 for modulous");
        x = opt.nextInt();
        int a;
        Scanner v1 = new Scanner(System.in);
        System.out.println("Enter Your First Value");
        a = v1.nextInt();
        System.out.println("Your First Value:" + a);
        int b;
        Scanner v2 = new Scanner(System.in);
        System.out.println("Enter Your Second Value");
        b = v2.nextInt();
        System.out.println("Your Second Value:" + b);



        if (x==1){
            System.out.println("You Choose Addition");
            int ans = a + b;
            System.out.println(ans);
        }

        else if(x==2){
            System.out.println("You Choose Substraction");
            int ans =  a-b;
            System.out.println(ans);
        }

        else if(x==3){
            System.out.println("You Choose Multiplication");
            int ans =  a*b;
            System.out.println(ans);
        }
        else if(x==4){
            System.out.println("You Choose Division");
            int ans =  a/b;
            System.out.println(ans);
        }
        else if(x==5){
            System.out.println("You Choose Modulous");
            int ans =  a%b;
            System.out.println(ans);
        }

        else {
            System.out.println("Incorrect Input");
        }
    }
}

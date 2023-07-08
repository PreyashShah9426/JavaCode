import java.util.Scanner;

public class Java070803 {
    public static void main(String[] args) {
        Scanner loc = new Scanner(System.in);
        System.out.println("Enter Your Location");
        String a = loc.nextLine();
        String Pragra;

        switch (a){
            case "Pragra":
                System.out.println("Location: Mississauga");

            case "CN TOWER":
                System.out.println("Location: Toronto");

        }
    }
}

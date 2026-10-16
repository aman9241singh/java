import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String str = sc.nextLine();

        try {
            int num = Integer.parseInt(str);
            System.out.println("Valid Number");
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid Number");
        }

        sc.close();
    }
}

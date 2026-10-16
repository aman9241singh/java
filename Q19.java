import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integers:");
        System.out.println("Enter a non-integer to stop.");

        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
        }

        System.out.println("Non-integer entered. Program stopped.");

        sc.close();
    }
}

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String str = sc.nextLine();

        int num = Integer.parseInt(str);

        System.out.println("Integer value = " + num);

        sc.close();
    }
}

public class Q24 {
    public static void main(String[] args) {

        String str1 = "100";
        String str2 = "10.5";
        String str3 = "20.5f";
        String str4 = "50000";

        int num1 = Integer.parseInt(str1);
        double num2 = Double.parseDouble(str2);
        float num3 = Float.parseFloat(str3);
        long num4 = Long.parseLong(str4);

        System.out.println("Integer = " + num1);
        System.out.println("Double = " + num2);
        System.out.println("Float = " + num3);
        System.out.println("Long = " + num4);
    }
}

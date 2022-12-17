package Java_Basic;

import java.util.Scanner;

public class Lesson6Task3 {

    public static void main(String[] args) {

        Scanner myObj = new Scanner (System.in);
        System.out.println("Enter text1");
        String text1 = myObj.nextLine();
        System.out.println(text1);
        System.out.println("Enter text2");
        String text2 = myObj.nextLine();
        System.out.println(text2);

        int len1 = text1.length();
        int len2 = text2.length();

        if (len1%2 == 0 && len2%2 == 0) {
            System.out.println("Text1 has the even length ");
            System.out.println("Text2 has the even length ");

            String result = getFirstPart(text1, len1) + getLastPart(text2, len2);
            System.out.printf("Partial strings concatenation: %s \n", result);
        }

        System.out.println("Enter int x");
        int x = Integer.parseInt(myObj.nextLine());
        System.out.println("Enter int y");
        int y = Integer.parseInt(myObj.nextLine());

        System.out.printf("x+y = %d \n", addition_XY(x,y));
        System.out.printf("x-y = %d \n", subtraction_XY(x,y));
        System.out.printf("x*y = %d \n", multiplication_XY(x,y));
        System.out.printf("x/y = %f \n", division_XY(x,y));

        System.out.println("Enter Euros");
        String euros = myObj.nextLine();
        int neuros = Integer.parseInt(euros);

        System.out.printf("Dollars: %f \n",neuros*1.06);

        System.out.printf("Extra calories: %f \n", getExtraCalories());
    }
    public static double getExtraCalories() {

        return Math.PI*(28-24)*40;
    }
    public static String getFirstPart(String s, int l) {
        return s.substring(0,l/2);
    }

    public static String getLastPart(String s, int l) {
        return s.substring(l/2, l);
    }
    public static int addition_XY(int x, int y) {
        return x + y;
    }
    public static int subtraction_XY(int x, int y) {
        return x - y;
    }
    public static int multiplication_XY(int x, int y) {
        return x * y;
    }
    public static double division_XY(double x, double y) {
        return x / y;
    }
}

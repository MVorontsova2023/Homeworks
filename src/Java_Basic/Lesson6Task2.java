package Java_Basic;

public class Lesson6Task2 {
    public static String line = new String("I study Basic Java!");
    public static void main(String[] args) {
        getLine(line);
    }
    public static void getLine(String s) {
        System.out.println(s.charAt(s.length() - 1));

        if (s.contains("Java")) {
            System.out.println("It contains Java");
        }
        else {
            System.out.println("It doesn't contain Java");
        }

        s = s.replace('a','o');
        System.out.println(s);
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        int x = line.indexOf("Java");
        int y = x + "Java".length();
        System.out.println(line.substring(x,y));
    }
}

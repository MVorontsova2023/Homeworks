package HW_17_03_2023;

public class HanoiRecursive {
    public void hanoiRecursive(int n, String source, String dest, String temp) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + dest);
        } else {
            hanoiRecursive(n - 1, source, temp, dest);
            System.out.println("Move disk " + n + " from " + source + " to " + dest);
            hanoiRecursive(n - 1, temp, dest, source);
        }
    }
}

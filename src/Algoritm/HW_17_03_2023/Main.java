package HW_17_03_2023;


public class Main {
    public static void main(String[] args) {

        int i = 3;
        String source = "source";
        String dest = "dest";
        String temp = "temp";

//        HanoiRecursive hRecursive = new HanoiRecursive();
//        hRecursive.hanoiRecursive(i, source, dest, temp);

        HanoiTowerIterative htIterative = new HanoiTowerIterative();
        htIterative.hanoiIterative(i);

    }
}

package Java_Basic;

public class Homework12_01_2023Level1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.main();

        Task2 task2 = new Task2();
        task2.main();
    }

    static class Task1 {
        void main() {
            int arrSize = 8;
            int [] arr = new int[arrSize];
            for (int i = 0; i < arrSize; i++) {
                arr[i] = (int) ((Math.random() * (50 - 1)) + 1);
                System.out.print(" " + arr[i]);
            }
            System.out.println();

            for (int i = 0; i < arrSize; i++) {
                if (i%2 != 0)
                    arr[i] = 0;
                System.out.print(" " + arr[i]);
            }

            System.out.println("\n ----------------------------------");
        }
    }

    static class Task2 {
        void main() {
            int arrSize = 5;
            int [] arr = new int[arrSize];
            for (int i = 0; i < arrSize; i++) {
                arr[i] = (int) ((Math.random() * (99 - 10)) + 10);
                System.out.print(" " + arr[i]);
            }
            System.out.println();

            boolean isStrictlyIncreasing = true;
            for (int i = 1; i < arrSize; i++) {
                if (arr[i] < arr[i-1]) {
                    isStrictlyIncreasing = false;
                    break;
                }
            }

            if (isStrictlyIncreasing)
                System.out.println("Mасcив является  строго возрастающей последовательностью");
            else
                System.out.println("Mасcив не является  строго возрастающей последовательностью" );
        }
    }
}

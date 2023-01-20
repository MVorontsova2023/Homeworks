package Java_Basic;

import java.util.Scanner;

public class Homework19_01_2023Level1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.main();

        Task2 task2 = new Task2();
        task2.main();

        Task3 task3 = new Task3();
        task3.main();
    }

    static class Task1 {
        void main() {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n - 1];
            for (int i = 0; i < n -1; i++) {
                arr[i] = (int) (Math.random() * n);

                boolean isUniq = false;

                do {
                    boolean isAllchecked = true;
                    for (int j = 0; j < i; j++) {
                        if (arr[i] == arr[j]) {
                            arr[i] = (int) (Math.random() * n);
                            isAllchecked = false;
                        }
                    }

                    if (isAllchecked)
                        isUniq = true;
                }
                while (!isUniq);
            }

            for (int i = 0; i < n -1; i++) {
                    System.out.print(" " + arr[i]);
            }
            System.out.println();

            for (int j = 0; j < n; j++) {
                boolean isExistinArray = false;
                for (int i = 0; i < n -1; i++) {
                    if (arr[i] == j) {
                        isExistinArray = true;
                    }
                }

                if (!isExistinArray)
                    System.out.print("Missing Number: " + j);
            }

        }
    }

    static class Task2 {
        void main() {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = (int) (Math.random() * n);
                System.out.print(" " + arr[i]);
            }
            System.out.println();

            for (int j = 0; j < n; j++) {
                for (int i = 0; i < n; i++) {
                    if ((i != j) && (arr[i] + arr[j] == k)) {
                        System.out.printf("Pair: %d %d [j,i]: %d %d", arr[j], arr[i], j, i);
                        System.out.println();
                    }
                }
            }
        }
    }

    static class Task3 {
        void main() {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();

            StringBuilder sb = new StringBuilder();
            sb.append(String.format("%d + %d = %d\n", n,k, n + k));
            sb.append(String.format("%d - %d = %d\n", n,k, n - k));
            sb.append(String.format("%d * %d = %d\n", n,k, n * k));
            System.out.println(sb);

            StringBuilder sb_b = new StringBuilder(sb);
            StringBuilder sb_c = new StringBuilder(sb);

            int i = 0;
            for (int j = 0; j < 3; j++) {
                i = sb_b.indexOf("=");
                sb_b.deleteCharAt(i);
                sb_b.insert(i, "равно");
            }
            System.out.println(sb_b);

            for (int j = 0; j < 3; j++) {
                i = sb_c.indexOf("=");
                sb_c.replace(i, i + 1,"равно");
            }
            System.out.println(sb_c);
        }
    }
}

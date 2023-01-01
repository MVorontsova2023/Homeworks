package Java_Basic;

import java.util.Scanner;

public class Homework5Level1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.main();

        Task2 task2 = new Task2();
        task2.main();

        Task3 task3 = new Task3();
        task3.main();

    }

    static class Task1  {
        void main() {
            boolean canWalk;

            Scanner sc = new Scanner(System.in);

            boolean isWeekend = sc.nextBoolean();
            boolean isRain  = sc.nextBoolean();

            if (isWeekend && !isRain)
                canWalk = true;
            else
                canWalk = false;

            System.out.println(canWalk);
        }
    }

    static class Task2  {
        void main() {
            Scanner sc = new Scanner(System.in);

            boolean isEdekaOpen = sc.nextBoolean();
            boolean isReweOpen  = sc.nextBoolean();

            if (canBuy(isEdekaOpen, isReweOpen)) {
                String s = (String)((isEdekaOpen) ? " Edeka" : "") + (String)((isReweOpen) ? " Rewe" : "");
                System.out.printf("Я могу купить еду, это %s\n", s);
            }
        }

        private static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {
            if (isEdekaOpen || isReweOpen)
                return true;
            else
                return false;
        }
    }

    static class Task3  {
        void main() {
            int tempLevel = 100;

            Scanner sc = new Scanner(System.in);

            int Temperature1 = sc.nextInt();
            int Temperature2 = sc.nextInt();

            boolean result = checkDevice(tempLevel, Temperature1, Temperature2);
            System.out.println(result);
        }

        private static boolean checkDevice(int tempLevel, int temperature1, int temperature2) {
            if (temperature1 > tempLevel && temperature2 < tempLevel) return true;
            else return false;
        }
    }
}

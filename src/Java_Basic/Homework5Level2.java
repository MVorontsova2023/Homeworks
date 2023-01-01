package Java_Basic;

import java.util.Scanner;

public class Homework5Level2 {
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
            int max = 28800;
            int n = (int)(Math.random()* max);

            showresttime(n);
            System.out.println();
        }

        private static void showresttime(int n) {

            int hours = n/60/60;

            System.out.printf("До конца рабочего дня осталось %d секунд \n", n);
            if (hours > 0) {
                switch (hours) {
                    case 8:
                    case 7:
                    case 6:
                    case 5:
                        System.out.printf("До конца рабочего дня осталось %d часов", hours);
                        break;

                    case 4:
                    case 3:
                    case 2:
                        System.out.printf("До конца рабочего дня осталось %d часа", hours);
                        break;

                    case 1:
                        System.out.println("До конца рабочего дня остался 1 час");
                        break;
                }
            }
            else
                System.out.println("До конца рабочего дня осталось менее часа");
        }
    }

    static class Task2 {
        void main() {
            Scanner sc = new Scanner(System.in);

            int floor = sc.nextInt();
            int stepUp = sc.nextInt();
            int stepDown = sc.nextInt();

            int number = numberOfLifts(floor, stepUp, stepDown);
            System.out.println(number);
        }

        private static int numberOfLifts(int floor, int stepUp, int stepDown) {
            int n = 0;
            int h = 0;

            while (h < floor) {
                h += stepUp - stepDown;
                n++;
            }

            return n;
        }
    }

    static class Task3 {
        void main() {
            Scanner sc = new Scanner(System.in);

            int account = sc.nextInt();

            int ndays = numberOfDays(account);
            System.out.println(ndays);
        }

        private static int numberOfDays(int account) {
            int ndays = 0;

            int remainder = account;

            do {
                ndays++;

                int n = maxPrimeDivider(remainder);

                if (n == remainder)
                    remainder -= 1;
                else
                    remainder -= n;

                if (remainder == 0)
                    break;
            }
            while (remainder > 0) ;


            return ndays;
        }

        private static int maxPrimeDivider(int n) {
            var res = (n % 2 != 0) ? 1 : 2;

            while (n % 2 == 0) {
                n /= 2;
            }

            for (var q=3; q*q<n; q+=2) {
                for (; n%q == 0; n/=q) {
                    res = q;
                }
            }

            return res > n ? res : n;
        }
    }
}

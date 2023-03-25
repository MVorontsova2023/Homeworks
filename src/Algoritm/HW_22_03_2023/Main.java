package HW_22_03_2023;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        int res1 = task1.Solution1(5,5);
        int res2 = task1.Solution2(5,5);
        System.out.println(res1);
        System.out.println(res2);

        Task2 task2 = new Task2();
        int kthElement = task2.findKthElement();
        System.out.println(kthElement);

        Task3 task3 = new Task3();
        int count = task3.countOccurrences();
        System.out.println(count);
    }
}

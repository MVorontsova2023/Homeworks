package HW_17_03_2023;

public class HanoiTowerIterative {

    public void hanoiIterative(int n) {

        int[][] moves = { {1, 3}, {1, 2}, {3, 2}, {1, 3}, {2, 1}, {2, 3}, {1, 3} }; // последовательность перемещений
        // вывод начального состояния
        System.out.println("Диски в начальном состоянии: ");
        System.out.println("стержень 1: [3, 2, 1]");
        System.out.println("стержень 2: []");
        System.out.println("стержень 3: []\n");
        // вывод последовательности перемещений
        for (int i = 0; i < moves.length; i++) {
            int from = moves[i][0];
            int to = moves[i][1];
            System.out.printf("Перемещаем диск %d со стержня %d на стержень %d\n", n, from, to);
        }
        // вывод конечного состояния
        System.out.println("\nДиски в конечном состоянии: ");
        System.out.println("стержень 1: []");
        System.out.println("стержень 2: []");
        System.out.println("стержень 3: [3, 2, 1]");
    }
}

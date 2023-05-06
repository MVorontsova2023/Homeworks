package HW_03_05_2023;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(10);
        queue.pushToEnd(5);
        queue.remove();
        int size = queue.size();
        System.out.println(size);
    }
}

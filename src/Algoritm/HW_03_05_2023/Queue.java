package HW_03_05_2023;

public class Queue {
    private int[] arr; // массив для хранения элементов queue
    private int head; // head указывает на передний элемент в queue
    private int tail; // tail часть указывает на последний элемент в queue
    private int capacity; // максимальная емкость queue
    private int count; // текущий размер queue

    // Конструктор для инициализации queue
    public Queue(int size) {
        arr = new int[size];
        capacity = size;
        count = 0;
        head = 0;
        tail = -1;
    }

    // Вставка элемента в конец queue
    public void pushToEnd(int data) {
        if (count == capacity) {
            throw new IllegalStateException("Queue is full");
        }
        tail = (tail + 1) % capacity;
        arr[tail] = data;
        count++;
    }

    // Удаление элемента из начала queue
    public int remove() {
        if (count == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        int data = arr[head];
        head = (head + 1) % capacity;
        count--;
        return data;
    }

    // Возвращает элемент из начала queue
    public int peek() {
        if (count == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return arr[head];
    }

    // Проверка, пуст ли queue
    public boolean isEmpty() {
        return (count == 0);
    }

    // Возвращает размер queue
    public int size() {
        return count;
    }

}

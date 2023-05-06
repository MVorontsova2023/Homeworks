package HW_28_04_2023;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.addFirst("str1");
        list.addLast("str2");

        // Блок тестирования
        System.out.println("Вывод в консоль с помощью итератора");
        MyLinkedList.LinkedListIterator iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

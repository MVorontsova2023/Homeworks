package HW_21_04_2023;
//        1. Создать лист.
//        В цикле наполнить лист 10 миллионами значений (от 1 до 10000000)
//        Перебрать лист с помощью for-each, в цикле каждое значение листа записать в переменную temp.
//        Сделать то же самое с помощью классического for.
//        Сделать то же самое с помощью классического for, но сначала вынести размер листа в отдельную переменную, а потом эту переменную использовать внутри условия цикла.
//        Сделать то же самое, что и в пункте 5, но перебрать лист с конца до начала.
//        Сделать то же самое, но используя Iterator.
//        Сделать то же самое, но используя ListIterator.
//        Для всех случаев 3-8 замерить время, в течение которого отрабатывает цикл:
//        Замеряете текущее время до цикла с помощью метода System.currentTimeMillis();
//        Замеряете текущее время после цикла с помощью метода System.currentTimeMillis();
//        Выводите разницу во времени после и до в консоль


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class Main {
    public static void main(String[] args) {

    // Создаем лист
    List<Integer> list = new ArrayList<>();

    // Наполняем лист 10 миллионами значений от 1 до 10000000
    for (int i = 1; i <= 10000000; i++) {
        list.add(i);
    }

    // Первый вариант: перебираем лист с помощью for-each
    long startTime = System.currentTimeMillis();
    for (int temp : list) {
    }
    long endTime = System.currentTimeMillis();
    System.out.println("Время выполнения цикла for-each: " + (endTime - startTime) + " миллисекунд");

    // Второй вариант: перебираем лист с помощью классического for
    startTime = System.currentTimeMillis();
    for (int i = 0; i < list.size(); i++) {
        int temp = list.get(i);
    }
    endTime = System.currentTimeMillis();
    System.out.println("Время выполнения цикла for: " + (endTime - startTime) + " миллисекунд");

    // Третий вариант: перебираем лист с помощью классического for и выносим размер листа в отдельную переменную
    int size = list.size();
    startTime = System.currentTimeMillis();
    for (int i = 0; i < size; i++) {
        int temp = list.get(i);
    }
    endTime = System.currentTimeMillis();
    System.out.println("Время выполнения цикла for c размером листа: " + (endTime - startTime) + " миллисекунд");

    // Четвертый вариант: перебираем лист с конца до начала
    startTime = System.currentTimeMillis();
    for (int i = list.size() - 1; i >= 0; i--) {
        int temp = list.get(i);
    }
    endTime = System.currentTimeMillis();
    System.out.println("Время выполнения цикла for с конца до начала: " + (endTime - startTime) + " миллисекунд");

    // Пятый вариант: перебираем лист с помощью Iterator
    startTime = System.currentTimeMillis();
    Iterator<Integer> iterator = list.iterator();
    while (iterator.hasNext()) {
        int temp = iterator.next();
    }
    endTime = System.currentTimeMillis();
    System.out.println("Время выполнения цикла с использованием Iterator: " + (endTime - startTime) + " миллисекунд");

    // Шестой вариант: перебираем лист с помощью ListIterator
    startTime = System.currentTimeMillis();
    ListIterator<Integer> listIterator = list.listIterator();
    while (listIterator.hasNext()) {
        int temp = listIterator.next();
    }
    endTime = System.currentTimeMillis();
    System.out.println("Время выполнения цикла с использованием ListIterator: " + (endTime - startTime) + " миллисекунд");
    }

}

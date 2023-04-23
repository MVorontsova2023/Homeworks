package Java_QAlesson6;


//import jdk.internal.icu.text.UnicodeSet;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    private static Integer index;
    private static Object words;

    public static void main(String[] args){
        List< Integer> integers = new ArrayList<>();



        integers.add(0 , 3);
//        integers.add(index: 1, element:5);
//        integers.add(index: 2, element:7);
//        integers.add(index: 3, element:15);

        System.out.println((integers));
        integers.add(4);
        System.out.println((integers));
//        UnicodeSet integers1;
//        integers1.add(20);
//        integers1.add(30);
//        integers1.add(40);
//        integers.addAll(3,integers1);
//        integers.remove(3 );
    System.out.println((integers));
    List<String> words = new ArrayList<>();
        words.add("Hello");



    }
}

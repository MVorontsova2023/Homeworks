package Java_QAlesson6;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {

    public static List<String> joinLists(List<String>first, List<String>second) {
       List<String> result = new ArrayList<>();

       result.addAll(first);
       result.addAll(second);

       return result;
    }
    public static List<String> joinWithoutDuplicates(List<String>first, List<String>second) {
        List<String> result = new ArrayList<String>();

        result.addAll(first);
        result.addAll(second);

        return result;
    }
}

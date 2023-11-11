package week6.GenericsTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Generic <Generic> values = new Generic<>();
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        values.sumEvenOdd(list);

        List<String> listtwo = new ArrayList<>(Arrays.asList("Fikret", "Sead", "Alen", "Selim", "Dario", "Orhan"));
        System.out.println(values.newList(listtwo));
    }
}

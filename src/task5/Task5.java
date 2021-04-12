package task5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        final List<String> listString = new ArrayList<>();
        listString.add("alex");
        listString.add("ala");
        listString.add("cho");
        listString.add("Acrobatic");
        listString.add("Arc");
        listString.add("and");
        listString.add("text");

        System.out.println("List : " + listString);
        System.out.println("List filtered - start 'a' and word has 3 char:"
                + stringStartAand3Char(listString));

        final List<Integer> listInteger = new ArrayList<>();
        listInteger.add(3);
        listInteger.add(12);
        listInteger.add(10);
        listInteger.add(33);

        System.out.println(filterTask(listInteger));

    }


    public static List<String> stringStartAand3Char(List<String> myList) {


        return myList.stream()
                .filter(a -> a.startsWith("a") && a.length() == 3)
                .collect(Collectors.toList());
    }

    public static String filterTask(List<Integer> myList) {

        return myList.stream()
                .map(e -> {
                    if (e % 2 == 0) {
                        return "o" + e;
                    }
                    return "e" + e;
                })
                .collect(Collectors.joining(","));


    }
}

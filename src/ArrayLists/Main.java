package ArrayLists;

import java.util.ArrayList;

/**
 * Class created by Krish
 */

public class Main {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(); // instantiate a new ArrayList
        arrayList.add("String 1"); // String 1
        arrayList.add("String 2"); // String 1, String 2
        arrayList.add("String 3"); // String 1, String 2, String 3
        arrayList.add(0, "String 0"); // String 0, String 1, String 2, String 3
        arrayList.remove("String 0"); // String 1, String 2, String 3
        arrayList.remove(2); // String 1, String 2

        System.out.println(arrayList); // print the elements in the form [<item 1>, <item 2>, <item 3> ...]
        arrayList.forEach(o -> System.out.print(o + "\t")); // print elements using lambda expressions
        System.out.println();

        for (int i = 0; i < arrayList.size(); i++) // print elements using a basic for loop
            System.out.print(arrayList.get(i) + "\t");
        System.out.println();

        for (String string : arrayList) // print elements using an enhanced for loop (foreach)
            System.out.print(string + "\t");
        System.out.println();

        System.out.println(arrayList.contains("String 1"));

        if (!arrayList.isEmpty()) arrayList.clear();

        arrayList.add("String 10");
        arrayList.set(0, "String 5");

        Object[] array = arrayList.toArray();

    }

}

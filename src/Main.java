import java.util.*;
import java.util.ArrayList;

import static java.util.Collections.sort;


public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Mango");
        arrayList.add("Strawberry");

        arrayList.remove(2);

        Collections.sort(arrayList);

        System.out.println("ArrayList: " + arrayList);
    }
}

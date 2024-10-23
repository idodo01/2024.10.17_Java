package Study_20241023.my_collection;

import java.util.*;

public class MyCompareMain1 {
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(50);
        integers.add(2);
        integers.add(3);
        integers.sort(null);
        System.out.println(integers); // 정렬 잘되는 모습


        ArrayList<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("orange");
        strings.add("banana");
        strings.add("mango");
        strings.sort(null);
        System.out.println(strings); // 정렬 잘되는 모습

    }
}

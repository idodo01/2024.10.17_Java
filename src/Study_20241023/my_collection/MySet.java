package Study_20241023.my_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MySet {


    public static void main(String[] args) {

        // 1. HashSet
        //HashSet<String> set = new HashSet<>();

        // 2. LinkedHashSet
        HashSet<String> set = new LinkedHashSet<>();

        set.add("1. apple");
        set.add("2. banana");
        set.add("1. apple");
        set.add("3. mango");
        set.add("4. grape");
        set.add("4. grape");
        set.add("5. orange");
        System.out.println(set);

        // 1. HashSet // index없고, 중복안됨
        // [4. grape, 5. orange, 1. apple, 2. banana, 3. mango]
        // 2. LinkedHashSet
        // [1. apple, 2. banana, 3. mango, 4. grape, 5. orange]



        System.out.println("==========================");
        // 출력 방법 1
        Iterator<String> iter = set.iterator();
        // 가져올 다음 요소가 있다면
        while(iter.hasNext()) {
            String data = iter.next(); // 다음 요소를 가져온다
            System.out.println(data);
        }

        System.out.println("==========================");
        // 출력 방법 2
        // 향상된 for문 (foreach)
        for(String v : set){
            System.out.println(v);
        }
    }
}


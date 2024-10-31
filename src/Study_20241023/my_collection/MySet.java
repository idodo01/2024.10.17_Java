package Study_20241023.my_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MySet {


    public static void main(String[] args) {

        // 1. HashSet
        HashSet<String> set1 = new HashSet<>();

        // 2. LinkedHashSet
        HashSet<String> set2 = new LinkedHashSet<>();

        set1.add("1. apple");
        set1.add("2. banana");
        set1.add("1. apple");
        set1.add("3. mango");
        set1.add("4. grape");
        set1.add("4. grape");
        set1.add("5. orange");
        System.out.println(set1);

        set2.add("1. apple");
        set2.add("2. banana");
        set2.add("1. apple");
        set2.add("3. mango");
        set2.add("4. grape");
        set2.add("4. grape");
        set2.add("5. orange");
        System.out.println(set2);

        // 1. HashSet // index없음, 중복없음
        // [4. grape, 5. orange, 1. apple, 2. banana, 3. mango]
        // 2. LinkedHashSet // 중복없음
        // [1. apple, 2. banana, 3. mango, 4. grape, 5. orange]



        System.out.println("==========================");
        // 출력 방법 1
        Iterator<String> iter = set1.iterator();
        // 가져올 다음 요소가 있다면
        while(iter.hasNext()) {
            String data = iter.next(); // 다음 요소를 가져온다
            System.out.println(data);
        }

        System.out.println("==========================");
        // 출력 방법 2
        // 향상된 for문 (foreach)
        for(String v : set2){
            System.out.println(v);
        }
    }
}


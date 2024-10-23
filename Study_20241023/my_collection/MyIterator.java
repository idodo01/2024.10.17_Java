package Study_20241023.my_collection;

import java.util.*;


public class MyIterator {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        List<Integer> list = Arrays.asList(1,2,3,4);
        List<Integer> list = List.of(1,2,3);

        // 3.
        // Iterator
        Iterator<Integer> iter = list.iterator();
        // 가져올 다음 요소가 있다면
        while(iter.hasNext()) {
            Integer data = iter.next(); // 다음 요소를 가져온다
            System.out.println(data);
        }

        System.out.println("==========================");
        // 2.
        // 향상된 for문 (foreach)
        for(int v : list){
            System.out.println(v);
        }

        System.out.println("==========================");
        // 1.
        // 일반 for문
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}


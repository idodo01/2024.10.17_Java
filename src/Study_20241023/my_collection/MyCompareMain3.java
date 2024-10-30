package Study_20241023.my_collection;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.*;


@ToString
@AllArgsConstructor
class Fruits {
    int price;
}

// 2. 판사 (judgement)
class Judgement implements Comparator<Fruits> {
    @Override
    public int compare(Fruits o1, Fruits o2) {
        return o1.price - o2.price;
    }
}

public class MyCompareMain3 {
    public static void main(String[] args) {

        System.out.println("*************************************************/");
        Fruits f1 = new Fruits(10);
        Fruits f2 = new Fruits(15);
        Fruits f3 = new Fruits(20);
        Fruits f4 = new Fruits(8);
        ArrayList<Fruits> fruits = new ArrayList<>();
        Judgement judgement = new Judgement();
        fruits.add(f1);
        fruits.add(f2);
        fruits.add(f3);
        fruits.add(f4);
        fruits.sort(judgement); // 1. 정렬 안됨 -> judgement를 통해서 정렬
        System.out.println(fruits);



    }
}

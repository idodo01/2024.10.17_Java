package Study_20241023.my_collection;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Comparator;
// Comparable => 나 자신을 정렬하기
// => 나와 같은 클래스의 객체들과 정렬하기
@ToString
@AllArgsConstructor
class Person1 {
    String name;
    int age;

}

@ToString
@AllArgsConstructor
class Fruits1 {
    int price;
}

// 판사 (judgement)
class Judgement1 implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Fruits && o2 instanceof Fruits) {
            Fruits f1 = (Fruits) o1;
            Fruits f2 = (Fruits) o2;
            return f1.price - f2.price;
        }
        else if(o1 instanceof Person && o2 instanceof Person) {
            Person p1 = (Person) o1;
            Person p2 = (Person) o2;
            return p1.age - p2.age;
        }
        return 0;
    }
}

public class MyCompareMain4 {
    public static void main(String[] args) {
        Judgement1 judgement1 = new Judgement1();

        Person1 p1 = new Person1("김", 10);
        Person1 p2 = new Person1("이", 15);
        Person1 p3 = new Person1("박", 20);
        Person1 p4 = new Person1("최", 8);
        ArrayList<Person1> persons1 = new ArrayList<>();

        persons1.add(p1);
        persons1.add(p2);
        persons1.add(p3);
        persons1.add(p4);
        persons1.sort(judgement1);
        System.out.println(persons1);
        /***************************************************/
        System.out.println("*************************************************/");
        Fruits1 f1 = new Fruits1(10);
        Fruits1 f2 = new Fruits1(15);
        Fruits1 f3 = new Fruits1(20);
        Fruits1 f4 = new Fruits1(8);
        ArrayList<Fruits1> fruits1 = new ArrayList<>();
        fruits1.add(f1);
        fruits1.add(f2);
        fruits1.add(f3);
        fruits1.add(f4);
        fruits1.sort(judgement1);
        System.out.println(fruits1);
    }
}
package Study_20241023.my_collection;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.ToString;


// 2. Comparable => 나 자신을 정렬하기
// => 나와 같은 클래스의 객체들과 정렬하기
@ToString
@AllArgsConstructor
// 3. implements Comparable<Person> 추가
class Person implements Comparable<Person> {
    String name;
    int age;

    // 4. 나이순 정렬
    @Override
    public int compareTo(Person o) {
        return this.age - o.age; // 정렬됨

//        if(this.age > o.age){
//            return 1; // 양수이기만 하면 됨, 내 나이가 더 크면 뒤로 간다
//        }
//        else if(this.age < o.age){
//            return -1;
//        }
//        return 0;
    }
}

public class MyCompareMain2 {
    public static void main(String[] args) {

        Person p1 = new Person("김", 10);
        Person p2 = new Person("이", 15);
        Person p3 = new Person("박", 20);
        Person p4 = new Person("최", 8);
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.sort(null);
        System.out.println(persons); // 1. 정렬 안됨 -> Comparable 필요



    }
}

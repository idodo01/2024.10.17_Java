package Basic;

class Person {
    String name;
    int age;

    public Person() {
        this("아무개",0);
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;

        if(age==0) {
            System.out.println("기본 생성자입니다");
        }
    }
}
public class P7 {
    public static void main(String[] args) {
        Person p1 = new Person();

        System.out.println("p1은 기본 이름인 '아무개'와 '0'살을 갖습니다");
        System.out.println("p1의 이름: "+p1.name);
        System.out.println("p1의 나이: "+p1.age);

        Person p2 = new Person("홍길동",50);
        System.out.println("p2은 사용자가 지정한 이름인 '홍길동'과 '50'살을 갖습니다");
        System.out.println("p2의 이름: "+p2.name);
        System.out.println("p2의 나이: "+p2.age);


    }
}

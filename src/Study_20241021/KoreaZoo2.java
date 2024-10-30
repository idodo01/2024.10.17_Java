package Study_20241021;
import lombok.AllArgsConstructor;

class Animal2{
    String name;
}

@AllArgsConstructor
class Lion2 extends Animal2{
    String name;
    @Override
    public String toString(){
        return name;
    }
}

@AllArgsConstructor
class Zebra2 extends Animal2{
    String name;
    @Override
    public String toString(){
        return name;
    }
}

class ZooKeeper2 {
    // 2. 다형성을 이용한 메서드 출력
    void feed(Animal2 animal){ // 먹이 주기 기능
        System.out.println(animal + "에게 먹이 주기");

        // 객체별로 메서드를 다르게 작성할 수 있음
        // (animal로 들어온 객체가) Lion2의 인스턴스니?
        if(animal instanceof Lion2){
            System.out.println(animal + "에게 고기 10개 주기");
        }
        // (animal로 들어온 객체가) Zebra2의 인스턴스니?
        if(animal instanceof Zebra2){
            System.out.println(animal + "에게 풀 더미 1덩이 주기");
        }
    }
}

// 한국 동물원
public class KoreaZoo2 {
    public static void main(String[] args) {
//        Lion2 lion = new Lion2("aaa");
//        Animal2 animal = lion;
//
// 1. 부모는 자식을 품을 수 있다는 사실을 기억하고, ZooKeeper2의 feed 부분을 보자

        ZooKeeper2 mikey = new ZooKeeper2();
        Lion2 lion2 = new Lion2("사돌이");
        Zebra2 zebra2 = new Zebra2("얼룩이");
        mikey.feed(lion2); // 밥주자~
        mikey.feed(zebra2); // 밥주자~
    }
}








package Study_20241021;

import lombok.AllArgsConstructor;

class Animal{
    String name;
}

@AllArgsConstructor
class Lion extends Animal{
    String name;
    @Override
    public String toString(){
        return name;
    }
}

@AllArgsConstructor
class Zebra extends Animal{
    String name;
    @Override
    public String toString(){
        return name;
    }
}

class ZooKeeper {
    
    // 메서드 오버로딩 하는 방식
    // => 동물이 1000마리 생기면, 메서드도 1000 만들어야하는 문제점
    // => 다형성 이용 (KoreaZoo2.java)
    void feed(Lion lion){ // 먹이 주기 기능
        System.out.println(lion + "에게 먹이 주기");
    }
    void feed(Zebra zebra){ // 먹이 주기 기능
        System.out.println(zebra + "에게 먹이 주기");
    }
}

// 한국 동물원
public class KoreaZoo1 {
    public static void main(String[] args) {
        ZooKeeper mikey = new ZooKeeper();
        Lion lion1 = new Lion("사돌이");
        Zebra zebra1 = new Zebra("얼룩이");
        mikey.feed(lion1); // 밥주자~
        mikey.feed(zebra1); // 밥주자~


    }
}








package Study_20241018;
class Parent{
    String name = "부모";
    int age;
    void run(){
        System.out.println("달린다");
    }
}
class Child extends Parent{
    String name = "자식";
    void walk(){
        System.out.println("걷는다");
    }
    // 1) Override가 되었다고 명시함으로서, 인식을 쉽게
    // 2) Override가 제대로 되었는지 체크 또한 가능함
    @Override
    void run() {
        System.out.println("빨리 달린다!");
    }
}

class ChildChild extends Child{

}


public class MyInteritance {
    public static void main(String[] args) {
        Parent p = new Parent();
//        p.run();
//        p.name = "부모";
        System.out.println(p.name);

        Child c = new Child();
//        c.run();
        System.out.println(c.name);

        ChildChild cc = new ChildChild();
    }
}











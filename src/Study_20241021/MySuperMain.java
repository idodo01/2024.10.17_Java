package Study_20241021;

import lombok.*;

import java.util.ArrayList;
import java.util.Date;

// 1.
class MyParent extends Object{
    int pNum;
    MyParent(int num){
        System.out.println("MyParent 생성");
        pNum = num;
    }

    void method(){
        System.out.println("달린다");
    }
}

class MyChild extends MyParent{
    int pNum = 40;
    MyChild(){
        super(50); // 1. 부모인 MyParent 생성자에 값 50을 넘긴다
        System.out.println("MyChild 생성");
        System.out.println(super.pNum); // 2. super.pNum의 값은 50
    }

    @Override
    void method() {
        super.method();
        System.out.println("빨리 달린다");
    }

    @Override
    public String toString() {
        return "MyChild의 toString입니다~~~";
    }
}

// 3. 롬복으로 간단하게 코드 작성없이, 같은 기능을 할 수 있음
@NoArgsConstructor // 4.1 매개변수 없는 생성자
@AllArgsConstructor // 4.2 모든 변수를 매개변수로 지정한 생성자
@ToString // 4.3 모든 변수를 출력해주는 toString
@Getter
@Setter
class Monitor{
    private String name;
    private int price;
    private Date buyDate;


    // 4.2
//    Monitor(String name, int price, Date buyDate){
//        this.name = name;
//        this.price = price;
//        this.buyDate = buyDate;
//    }
//
    // 4.3
//    @Override
//    public String toString() {
//        return "Monitor{" +
//                "name='" + name + '\'' +
//                ", buyDate=" + buyDate +
//                '}';
//    }
}





public class MySuperMain {
    public static void main(String[] args) {
        // 1.
        MyChild child = new MyChild();
        child.method();
        System.out.println(child);
        String s = child.toString();
        System.out.println(s);

        // 2.
        int[] arr = new int[]{1,2,3};
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(arr);
        System.out.println(list);
        /***********************************/
        // 3.
        Monitor monitor = new Monitor("M1", 100000, new Date());
        System.out.println(monitor);
//        monitor.print_monitor();
    }
}







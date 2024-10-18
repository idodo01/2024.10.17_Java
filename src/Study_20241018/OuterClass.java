package Study_20241018;

public class OuterClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner(); // 내부 클래스 호출하는 방법
        inner.print_outer_var(); // 내부 클래스의 메서드
    }
}

class Outer{
    private int num = 100;
    private Inner inner;    // 3. 변수로 저장해둔다

    // 1. 내부 클래스를 사용할 경우,
    // 외부 클래스의 생성자에서
    Outer(){ // 2. 내부 클래스 객체 생성 후
        this.inner = new Inner();
    }

    class Inner{
        void print_outer_var(){
            System.out.println(num);
        }
    }
}

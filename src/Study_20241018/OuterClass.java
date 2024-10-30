package Study_20241018;

public class OuterClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner11 = outer.new Inner(); // 내부 클래스 호출하는 방법
        inner11.print_outer_var(); // 내부 클래스의 메서드
    }
}

class Outer{
    private int num = 100;
    private Inner inner;    // 3. 변수에 저장해둔다

    // (참고)  내부 클래스를 사용할 경우,
    // 1. 외부 클래스의 생성자에서
//    Outer(){
//        this.inner = new Inner(); // 2. 내부 클래스 객체 생성 후
//    }

    class Inner{
        void print_outer_var(){
            System.out.println(num);
        }
    }
}

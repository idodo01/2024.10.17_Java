package Study_20241021;

// 인터페이스를 상속받는 클래스는
// 인터페이스의 메서드를 무조건 오버라이딩해야함
interface Electronic{
    public final static String volt = "4V";
    public abstract void getVolt();
}

// 참고) 
// 추상 클래스내에 일반 메서드는 가능한데,
// 일반 클래스내에 추상 클래스 사용은 불가능
// 따라서, 추상 메서드를 사용하기 위해서는 추상 클래스 필요~!

// 추상 클래스
abstract class Computer implements Electronic{
    String a;
    // 추상메서드
    abstract void display();

    void test(){
        System.out.println("This is computer test");
    }
    
    // 인터페이스 메서드는 무조건 오버라이딩
//    @Override
//    public void getVolt() {
//
//    }
}
class AppleComputer extends Computer{
    @Override
    void display() {
        System.out.println("Apple");
    }
    
    // Computer클래스에서 오버라이딩 안하면
    // 여기 오버라이딩해도 됨
    @Override
    public void getVolt() {

    }
}



public class Notebook {
    public static void main(String[] args) {
    }
}

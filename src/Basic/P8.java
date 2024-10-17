package Basic;

class AClass {
    void method_a() {
        System.out.println("This is method A");
    }
}

class BClass extends AClass{
    void method_a() {
        System.out.println("This is method B");
    }
}

public class P8 {
    public static void main(String[] args) {
        AClass c = new BClass();
        c.method_a();
    }
}

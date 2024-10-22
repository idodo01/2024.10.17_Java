package Study_20241022.my_annotation;

class Calculator{
    void calc(){
        System.out.println("calc");
    }
}
class 공학계산기 extends Calculator{
    @Override
    void calc() {
        System.out.println("공학 calc");
    }
}

public class MyLamdbaMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator(){
            @Override
            void calc() {
                System.out.println("새 calc");
            }
        };
        calc.calc();
    }
}


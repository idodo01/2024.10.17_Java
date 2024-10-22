package Study_20241022.my_annotation;


@FunctionalInterface
interface Calculator2{
    void calc();
}

class 공학계산기2 implements Calculator2{
    @Override
    public void calc() {}
}

public class MyLamdbaMain2 {
    public static void main(String[] args) {
        Calculator2 calc1 = new Calculator2(){
            @Override
            public void calc() {
                System.out.println("새 calc");
            }
        };

        calc1.calc();


        // 람다식은
        // 클래스가 아닌 인터페이스일 때 사용가능
        
        // 그리고 메서드가 하나밖에 없기 때문에,
        // 람다식으로 가능한 것
        Calculator2 newCalc =
                () -> {
                    System.out.println("새 calc22");
                };
        newCalc.calc();

    }
}





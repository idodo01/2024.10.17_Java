package Study_20241018;

class Annony{
    void test() {
        System.out.println("안녕");
    }
}
//class Annony_A extends Annony{    // 메서드 하나 오버라이딩하려고
                                    // 클래스를 계속 만들어내는 게
                                    // 비효율적으로 느껴짐 => 익명클래스사용
//    @Override
//    void test() {
//        System.out.println("하이!");
//    }
//}
//class Annony_B extends Annony{
//    @Override
//    void test() {
//        System.out.println("헬로!");
//    }
//}


public class MyAnnony {
    public static void main(String[] args) {
        /********************************************/
        int num = 200;

        // 익명 클래스
        // Annony의 자식 객체를 만들었다.?
        Annony a = new Annony(){ // 부모 클래스 객체 생성 동시에, 자식도 만들어짐
            int f = 100000;
            @Override
            void test() {
//                num = 300;     //익명 클래스는 외부 변수값을 바꿀 수 없다.
                System.out.println(num); // 물론, 사용하는 것은 가능하다
                System.out.println(f);
            }
        };


        a.test();
//        System.out.println(a.num);


    }
}

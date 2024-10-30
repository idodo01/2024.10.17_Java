package Study_20241021;

public class ExceptionMain2 {
                            // 3. 날 호출한 클래스에 오류 처리 전가 => main()으로
    static void m1() throws Exception {
        m2();
    }
                            // 2. 날 호출한 클래스에 오류 처리 전가 => m1()으로
    static void m2() throws Exception {
        // 1. 오류를 일부러 만들어 내기
        throw new NullPointerException();
    }

    public static void main(String[] args) {

        try { // 4. try-catch문 으로 오류 처리
            m1();
        } catch (Throwable e) {
            System.out.println("오류가 발생했어요!!");
        }

    }
}
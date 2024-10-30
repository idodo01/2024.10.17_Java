package Study_20241021;

public class ExceptionMain {
    public static void main(String[] args) {
        String a = null;
        
        try {
            System.out.println( 1 / 0 ); // 1번 catch문 실행됨
//            System.out.println(a.length()); // 2번 catch문 실행됨
            System.out.println("완료^0^");
        }
        catch (ArithmeticException e){ // 1번 catch문 // 수학식에서 존재할 수 없는 연산을 수행시킬 때
            System.out.println("0으로 나눴다!");
            System.out.println(e);
        }
        catch (NullPointerException e){ // 2번 catch문 // 객체 참조가 없는 상태 (= null)
            System.out.println("NULL 에러발생!");
            System.out.println(e);
        }
        // 요즘 잘안쓰임
        // 오류가 있든없든 실행하는 블럭
        finally {

        }
        // 모든 에러
//        catch (Exception e){
//            System.out.println(e);
//        }

        System.out.println("프로그램 끝");

    }
}
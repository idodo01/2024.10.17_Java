package Study_20241017;

// Upper Camel Case 맨 앞만 대문자 사용 (Class나 모듈 이름에 사용함)
// 게시글의 형태를 정의했다 == 클래스
class Board{
    int no; // 게시물 번호
    String title; // 게시글 제목

    // Under Score: 언더바를 사용해서 이름을 정의
    // Snake Case: 각 단어 사이를 _ 로 구분짓는 이름 명명 방법
    // void: 반환값이 없다는 의미. == return하는 값이 없음
    void print_data(int number){
        System.out.println("데이터를 출력합니다^-^");
        System.out.println("number: " + number);
    }

    String status1(int number){
        System.out.println("현재 상태를 측정합니다..");
        return number == 1 ? "정상" : "비정상";
    }

    String status2(int number1, int number2){
        System.out.println("현재 상태를 측정합니다..");
        if (number1 > 0 && number2 > 0){
            return "정상";
        }
        return "비정상";
    }

    String status3(int[] numbers){
        System.out.println("현재 상태를 측정합니다..");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                return "비정상";
            }
        }
        return "정상";
    }

    String status4(int... numbers){
        System.out.println("현재 상태를 측정합니다..");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                return "비정상";
            }
        }
        return "정상";
    }

}


public class MyFirstClass {
    public static void main(String[] args) {
        Board board1 = new Board();
        board1.no = 1;
        board1.title = "첫 게시물!";
        System.out.println(board1.no);
        System.out.println(board1.title);
        board1.print_data(50); // 메서드를 호출한다
        board1.print_data(10); // 메서드를 호출한다
        board1.print_data(0); // 메서드를 호출한다

        // status1, status2
        board1.status1(1);
        board1.status2(1,2);

        // status3
        int[] numbers = new int[]{ 1, 2, 3, 4 };
        String stat = board1.status3(numbers); // 실행 후에 "정상"이 반환된다
        System.out.println(stat);

        // status4
        String stat2 = board1.status4(new int[]{ 1, 2, 3, 4 }); // 실행 후에 "정상"이 반환된다
        System.out.println(stat2);

        // 꼭 배열로 전달안해도 됨
        String stat3 = board1.status4(0, 1);
        System.out.println(stat3);



//        Board board2 = new Board();
//        board2.no = 2;
//        board2.title = "두번째 게시물!";
//        System.out.println(board2.no);
//        System.out.println(board2.title);
        /**************************************/
        int a = 1;
        float b = 1.1f;
        char c = 'z';
        boolean d = true;

        String message = "This it Python";
        // String message = new String("This it Python");
        // String 객체에서 메서드를 호출했다
        String newMessage = message.toUpperCase();
        System.out.println(newMessage);
        /**************************************/



    }
}









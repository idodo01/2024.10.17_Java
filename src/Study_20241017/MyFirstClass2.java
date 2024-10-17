package Study_20241017;

class Board2{
    static String application = "KOREA게시판";
    int no; // 게시물 번호
    String title; // 게시글 제목

}


public class MyFirstClass2 {
    public static void main(String[] args) {
        Board2 board1 = new Board2();
        board1.application = "JAPAN게시판";
        System.out.println(board1.application);

        Board2 board2 = new Board2();
        System.out.println(board2.application); // board1에서 변경했는데도, 공유하고 있기에 값이 같이 변함

        // 원래 static 변수는
        // 인스턴스 생성 안하고, 바로 객체 접근
        System.out.println(Board2.application);
    }
}









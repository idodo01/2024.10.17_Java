package Study_20241017;

class Board2{
    static String application = "KOREA게시판";
    int no; // 게시물 번호
    String title; // 게시글 제목

}


public class MyFirstClass2 {
    public static void main(String[] args) {
        Board2 board1 = new Board2();
        System.out.println(board1.application);

        System.out.println("=========================");

        Board2 board2 = new Board2();
        board2.application = "JAPAN게시판";
        // board2에서 변경했는데도, 공유하고 있기에 board1의 값도 같이 변함
        System.out.println(board2.application);
        System.out.println(board1.application);

        System.out.println("=========================");
        // 원래 static 변수는
        // 인스턴스 생성 안하고, 객체로 바로 접근 가능
        System.out.println(Board2.application);
    }
}









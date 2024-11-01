package Study_20241101.mydb;

import java.sql.*;
import java.util.Date;

public class MyDBMain2 {
    static Connection connection;

    static void select_book(String bookIsbn){
        try {
            String selectBookByISBNSQL = "SELECT * FROM book WHERE isbn = ?";
            // PreparedStatement는 SQL Injection을 막아주는 기능이 있다
            PreparedStatement statement = connection.prepareStatement(selectBookByISBNSQL);
            statement.setString(1, bookIsbn); // 1 번째 ? 자리에 bookIsbn의 값을 설정한다
            // 쿼리를 전송한다
            ResultSet resultset = statement.executeQuery();
            // 결과를 가져온다
            boolean result = resultset.next();
            // 결과가 없으면 안내하고 끝낸다
            if(!result) {
                System.out.println("조회된 결과 없음");
                return;
            }
            String isbn = resultset.getString("isbn"); // isbn은 VARCHAR형태라서 STRING으로 가져온다
            String name = resultset.getString("name"); // name도 VARCHAR
            int price = resultset.getInt("price"); // price는 int형이므로 getInt를 통해 int형으로 가져옴
            Date publishDate = resultset.getDate("publish_date"); // publish_date는 DATETIME형태이므로 Date로 가져옴
            System.out.println("isbn: " + isbn);
            System.out.println("name: " + name);
            System.out.println("price: " + price);
            System.out.println("publishDate: " + publishDate);
        }catch (SQLException e){
            System.out.println("SELECT 실행 중 오류 발생!: "+ e.getMessage());
        }
    }

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/javatest";
        String user = "root";
        String password = "1234";
        try{
            // 메모리에 Driver 클래스 파일의 기능을 적재한다 => Driver에 정의된 기능들 사용할 수 있게 된다
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (Exception e){
            System.out.println("Driver를 찾을 수 없어요 ㅠ 라이브러리 다시 불러와주세요");
        }
        try {
            connection = DriverManager.getConnection(url, user, password);
            // INSERT를 시도해보기
//            String insertSQL = "INSERT INTO book VALUES ('A1', 'Java의 정석', 20000, '2024-11-01')";
//            PreparedStatement stmt = connection.prepareStatement(insertSQL);
//            stmt.execute();
            // SELECT를 시도해보기
//            String selectBookSQL = "select * from book";
//            PreparedStatement preparedStatement = connection.prepareStatement(selectBookSQL);
//            ResultSet resultset = preparedStatement.executeQuery(); // SELECT의 담당 메서드
//
//            while(resultset.next()) { // 다음 한 줄을 가져온다 (내부적으로 한 줄을 보고 있다)
//                String isbn = resultset.getString("isbn"); // isbn은 VARCHAR형태라서 STRING으로 가져온다
//                String name = resultset.getString("name"); // name도 VARCHAR
//                int price = resultset.getInt("price"); // price는 int형이므로 getInt를 통해 int형으로 가져옴
//                Date publishDate = resultset.getDate("publish_date"); // publish_date는 DATETIME형태이므로 Date로 가져옴
//
//                System.out.println("isbn: " + isbn);
//                System.out.println("name: " + name);
//                System.out.println("price: " + price);
//                System.out.println("publishDate: " + publishDate);
//            }
            /// PK를 통해 1개의 값만 조회하기
            select_book("A1");
            select_book("abc");
            select_book("b1");

            System.out.println("SQL 전송이 성공했습니다! MySQL에서 확인해주세요");
        }catch (SQLException e){
            System.out.println("url, user, password 중 하나가 틀렸어요! 확인해주세요: " + e.getMessage());
        }




    }
}

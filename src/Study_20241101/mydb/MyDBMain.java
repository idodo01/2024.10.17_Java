package Study_20241101.mydb;

import java.sql.*;
import java.util.Date;

public class MyDBMain {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/javatest";
        String user = "root";
        String password = "1234";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (Exception e){
            System.out.println("Driver를 찾을 수 없어요 ㅠ 라이브러리 다시 불러와주세요");
        }
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            // INSERT를 시도해보기
//            String insertSQL = "INSERT INTO book VALUES ('A1', 'Java의 정석', 20000, '2024-11-01')";
//            PreparedStatement stmt = connection.prepareStatement(insertSQL);
//            stmt.execute();
            // SELECT를 시도해보기
            String selectBookSQL = "select * from book";
            PreparedStatement preparedStatement = connection.prepareStatement(selectBookSQL);
            ResultSet resultset = preparedStatement.executeQuery(); // SELECT의 담당 메서드

            while(resultset.next()) { // 다음 한 줄을 가져온다 (내부적으로 한 줄을 보고 있다)
                String isbn = resultset.getString("isbn"); // isbn은 VARCHAR형태라서 STRING으로 가져온다
                String name = resultset.getString("name"); // name도 VARCHAR
                int price = resultset.getInt("price"); // price는 int형이므로 getInt를 통해 int형으로 가져옴
                Date publishDate = resultset.getDate("publish_date"); // publish_date는 DATETIME형태이므로 Date로 가져옴

                System.out.println("isbn: " + isbn);
                System.out.println("name: " + name);
                System.out.println("price: " + price);
                System.out.println("publishDate: " + publishDate);
            }

            System.out.println("SQL 전송이 성공했습니다! MySQL에서 확인해주세요");
        }catch (SQLException e){
            System.out.println("url, user, password 중 하나가 틀렸어요! 확인해주세요: " + e.getMessage());
        }



    }
}

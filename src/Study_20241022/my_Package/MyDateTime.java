package Study_20241022.my_Package;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class MyDateTime {
    // 2016년 a월 b일은 무슨 요일일까?
    // 요일에 따라, "SUN" "MON" "TUE" "WED" "THU" "FRI" "SAT" 를 반환해라
    static String what_day_is_it(int a, int b){

        LocalDate newDate = LocalDate.of(2016, a, b);

        // toString 기능이 있구나 확인가능
//        System.out.println("newDate.getDayOfWeek(): "+newDate.getDayOfWeek());

        String DayOfWeek = newDate.getDayOfWeek().toString();
        return DayOfWeek.substring(0,3); // index 0부터 2(3-1)까지, TUESDAY은 TUE로
    }

    public static void main(String[] args) {
        String result = what_day_is_it(5, 24);
        System.out.println(result); // TUE

        result = what_day_is_it(8, 10);
        System.out.println(result); // WED

        result = what_day_is_it(2, 4);
        System.out.println(result); // THU

        System.out.println("=============================");

        Date date = new Date();
        System.out.println(date);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        System.out.println("=============================");

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println("=============================");
        LocalDate newDate = LocalDate.of(2024, 4, 11);
        newDate.plusDays(50); // 50일 추가
        System.out.println("50일 추가된 날짜의 요일은? :"+newDate.getDayOfWeek());

        System.out.println("=============================");
        LocalTime newTime1 = LocalTime.of(22, 10);
        LocalTime newTime2 = LocalTime.of(23, 59, 59);
        LocalTime newTime3 = LocalTime.of(23, 59, 59, 8555);
        System.out.println(newTime1);
        System.out.println(newTime2);
        System.out.println(newTime3);

        System.out.println("=============================");
        LocalDateTime newDateTime1 = LocalDateTime.of(2024, 4, 11, 23, 59);
        System.out.println(newDateTime1);
        LocalDateTime newDateTime2 = LocalDateTime.of(2024, 4, 11, 23, 59, 59);
        System.out.println(newDateTime2);









    }
}

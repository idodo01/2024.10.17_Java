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
//        System.out.println(newDate.getDayOfWeek()); // toString으로 되어있구나 확인가능
        String DayOfWeek = newDate.getDayOfWeek().toString();

        return DayOfWeek.substring(0,3); // index 0부터 3까지
    }

    public static void main(String[] args) {
        String result = what_day_is_it(5, 24);
        System.out.println(result); // TUE

        result = what_day_is_it(8, 10);
        System.out.println(result); // ??

        result = what_day_is_it(2, 4);
        System.out.println(result); // ??




////////////////////////////////////////////////
        Date date = new Date();
        System.out.println(date);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        ////////////////////////////////////////
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);


        LocalDate newDate = LocalDate.of(2024, 4, 11);
        newDate.plusDays(50);
        System.out.println("요일"+newDate.getDayOfWeek());

        LocalTime newTime1 = LocalTime.of(22, 10);
        LocalTime newTime2 = LocalTime.of(23, 59, 59);
        LocalTime newTime3 = LocalTime.of(23, 59, 59, 8555);

        LocalDateTime newDateTime1 = LocalDateTime.of(2024, 4, 11, 23, 59);
        LocalDateTime newDateTime2 = LocalDateTime.of(2024, 4, 11, 23, 59, 59);










    }
}

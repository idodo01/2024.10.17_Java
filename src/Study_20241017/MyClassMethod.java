package Study_20241017;
class iPhone{
    static String 제조사 = "애플";
    String 기종;

    static void turn_on(){
        System.out.println("전원을 켭니다");
    }


}

public class MyClassMethod {
    public static void main(String[] args) {
        iPhone iPhone14 = new iPhone();
        iPhone14.기종 = "iPhone14";
        iPhone.turn_on(); // 객체로 바로 접근
        System.out.println(iPhone.제조사); // 객체로 바로 접근
        System.out.println(iPhone14.기종);

        iPhone iPhone15 = new iPhone();
        iPhone15.기종 = "iPhone15";
        iPhone.turn_on(); // 객체로 바로 접근
        System.out.println(iPhone.제조사); // 객체로 바로 접근
        System.out.println(iPhone15.기종);



    }
}

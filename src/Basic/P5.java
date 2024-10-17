package Basic;

class Problem5 {
    void TEST() {
        System.out.println("Test Vesion");
    }
    void TEST(int number) {
        System.out.println("Test Vesion : "+ number);
    }
    void TEST(double number, String version) {
        System.out.println("Test Vesion : "+number+version);
    }

}
public class P5 {

    public static void main(String[] args) {
        Problem5 p = new Problem5();
        p.TEST();
        p.TEST(2);
        p.TEST(2.51,"beta");
    }

}

package Basic;

class Problem4 {
    static int number = 2;

    static String notFour() {
        if(number >= 4 ) {
            return "4이상은 금지";
        } else {
            return "4미만은 가능";
        }
    }
}

public class P4 {
    public static void main(String[] args) {
        System.out.println(Problem4.notFour());
        Problem4.number++;
        Problem4.number++;
        System.out.println(Problem4.notFour());
    }
}

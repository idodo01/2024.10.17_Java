package Basic;
public class P0 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 55; i <= 150; i++) {
            if(i%11!=0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

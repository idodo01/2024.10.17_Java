package Study_20241022.my_annotation;


interface Sum{
    public void calc(int a);
}


public class MyLamdbaMain3 {
    public static void main(String[] args) {
        Sum sum1 = (a) -> { System.out.println(a); };
        Sum sum2 = System.out::println;

        sum1.calc(5);
        sum1.calc(10);
    }
}





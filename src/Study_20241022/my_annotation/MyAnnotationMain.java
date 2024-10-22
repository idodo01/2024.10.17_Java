package Study_20241022.my_annotation;

@interface MyAnno{
    String value();
    String name();
    int age();
}

@MyAnno(value = "1", name = "1", age = 18)
public class MyAnnotationMain {
    @MyAnno(value = "1", name = "1", age = 18)
    private int a;


    @MyAnno(value = "2", name = "2", age = 555)
    public static void main(String[] args) {
        System.out.println();
    }
}
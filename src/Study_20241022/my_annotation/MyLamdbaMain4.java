package Study_20241022.my_annotation;

interface TEST{
    public int check(int a, int b);
}
class MyClass{
    static int myMethod(int a, int b){
        return a + b;
    }
}


public class MyLamdbaMain4 {
    public static void main(String[] args) {

// 방법1
//        TEST test = new Test(){
//            public int check(int a, int b){
//                MyClass myClass = new MyClass();
//                int result = myClass.myMethod(a, b);
//                return result;
//            }
//        };
//        test.check(1,5);


// 방법2
//        MyClass myClass = new MyClass();
//        TEST test = (a, b) -> myClass.myMethod(a, b);

// 방법3
        TEST test = MyClass::myMethod;

        System.out.println(test.check(1,5));
    }
}





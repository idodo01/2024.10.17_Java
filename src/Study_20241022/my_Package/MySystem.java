package Study_20241022.my_Package;

class TEST{
    private TEST(){}
}

public class MySystem {
    public static void main(String[] args) {
        String s = "test";
        boolean result = s.matches(".*[e].*");
        System.out.println(result);

        System.out.println("=====================================");
        try {
            Class clazz = Class.forName("my_package.MySystem");
            MySystem sys = (MySystem)clazz.newInstance();
            System.out.println(clazz);
        }catch (Exception e){
            System.out.println("클래스가 없거나 경로가 잘못되었음");
        }

        System.out.println("=====================================");
        // 10184 1970년 1월 1일~
        long startTime = System.currentTimeMillis(); // startTime

        for (int i = 0; i < 5000000; i++) {
//            System.out.println("ㅋ");
        }

        long endTime = System.currentTimeMillis(); // endTime
        System.out.println("Time taken: " + (endTime - startTime)); // endTime-startTime
    }
}

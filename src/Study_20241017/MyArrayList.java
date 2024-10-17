package Study_20241017;

import java.util.*;
//import java.util.ArrayList;
//import java.util.Arrays;

public class MyArrayList {
    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;
//        System.out.println(arr);

        ArrayList array = new ArrayList();
        array.add("Hello");
        array.add(1);
        array.add("Java");
        // "Java"를 찾아서 제거하라!
        array.remove("Java");
        // 없으니까 넘어간다(pass)
        array.remove("ㄴㅁ아ㅣ런ㅇ라ㅣㅓ");
        // 내부에 몇 개의 요소가 있는지 정수로 알려준다
        int len = array.size();

        System.out.println("내부 개수: " + len);
        System.out.println(array);

        // index 1번 자리에 5.5를 넣고 원래 index 1번 이상 값들은 뒤로 다 미뤄라
        array.add(1, 5.5);
        // 요소 중 5.5가 있는가 없는가?
        boolean isExists = array.contains(5.5);
        System.out.println("존재하는가?: " + isExists);
        System.out.println(array);

        /*********************************************/
        ArrayList newList = new ArrayList();
        newList.add("안녕?");
        newList.add(1000);
        Object r = newList.get(1);
        // 0번째 index 값을 가져와서 출력하세요
        System.out.println( newList.get(0) );
        System.out.println( newList.get(1) );
        // 배열리스트 안에 들어있는 값이 숫자라고 확실할 수 없기에 불가능
        //System.out.println( newList.get(1) + 10 );


        /*********************************************/
        // <>로 정해줄 수 있다
        ArrayList<Integer> newList2 = new ArrayList<>();
        // newList.add("안녕?");
        newList2.add(5555);
        newList2.add(1000);
        newList2.add(55);
        newList2.add(778);
        newList2.add(1);
        int num = newList2.get(1);
        // 0번째 index 값을 가져와서 출력하세요
        System.out.println( newList2.get(0) );
        System.out.println( newList2.get(1) + 10 );

        // 오름차순 정렬해주세요
        newList2.sort(null);
        System.out.println(newList2);

        /*******************************************/
        // 객체 형태의 정수
        Integer i1 = 100;
//        Integer j = new Integer(200); // 자바 자체에서 사용을 자제하는 문법
        System.out.println(i1);

        String a = i1 + "abc";
        System.out.println(a);

        // String1
        String s = "100";
        String[] splitResult = s.split("");
        for (int i = 0; i < splitResult.length; i++) {
            System.out.println(splitResult[i]);
        }

        // String2
        String s2 = "100";
        String[] splitResult2 = s2.split("");
        String result = Arrays.toString(splitResult2); // Arrays import해야함
        System.out.println(result);

        // integer => String
        Integer i2 = 100; // 객체 형태의 정수
        String ss1 = i2.toString(); // String 형태로 변경
        String ss2 = "" + i2; // String 형태로 변경
        System.out.println(i2);

        // ??? => int or integer
        // String 혹은 int 형이 아닌 다른 형태를 Ingeter 혹은 int형으로 변경
        int z1 = Integer.parseInt("100"); // => int 형으로
        Integer z2 = Integer.valueOf("200"); // => Integer 형으로, (이 방법이 자주쓰임)


        /////////////////////////////////////////
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("Java");
        System.out.println(strings);

        strings.remove(0); // 0번째 index를 제거하라
        strings.remove("java"); // java 값을 제거하라
        System.out.println(strings);

        //////////////////////////////////////////////
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(100);
        numbers.remove(0); // 0번째 index를 제거하라
        numbers.remove("Java"); // "Java"를 찾아서 제거하라, 없으면 패스
        System.out.println(numbers);

        // 만약에 10 숫자를 제거하고 싶다면?
        //numbers.remove(100); 숫자 10이 아니라, index로 작동됨 (int형 10)
        Integer inte = new Integer(100); // (integer 10)으로 넣으면 됨
        numbers.remove(inte);


        // char 은 자동 변환되기에 97이 아니라 a가 출력됨
        char c = 97;
        System.out.println(c);



    }
}

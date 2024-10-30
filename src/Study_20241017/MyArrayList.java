package Study_20241017;

import java.util.*;
//import java.util.ArrayList;
//import java.util.Arrays;

public class MyArrayList {
    public static void main(String[] args) {
//        1. 배열 array
//            1) 지정된 크기로 고정
//            2) 인덱스로 요소에 직접 액세스 -> 빠름

        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;
//        System.out.println(arr);

        // array는 for문으로 요소 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

//        2. ArrayList
//            1) 동적으로 resize 가능
//            2) 비교적 느림
//            3) 편의성이 우선시 될 때 사용
        ArrayList array = new ArrayList();

//        1) add remove
        array.add("Hello");
        array.add(1);
        // index 1번 자리에 5.5를 넣고 원래 index 1번 이상 값들은 뒤로 다 미뤄라
        array.add(1, 5.5);
        array.add("Java");

        // "Java"를 찾아서 제거하라!
        array.remove("Java");
        // 없는 문자열은 넘어간다(pass)
        array.remove("ㄴㅁ아ㅣ런ㅇ라ㅣㅓ");

        System.out.println(array);
        System.out.println("=========================");

        // 2) size(): 내부에 몇 개의 요소가 있는지 정수로 알려준다
        int len = array.size();
        System.out.println("내부 개수: " + len);

        System.out.println("=========================");


        // 3) contains(): 요소가 있는지 없는지 boolean값으로 알려준다
        // 요소 중 5.5가 있는가 없는가?
        boolean isExists = array.contains(5.5);
        System.out.println("존재하는가?: " + isExists);
        System.out.println(array);

        System.out.println("=========================");
        /*********************************************/
        ArrayList newList = new ArrayList();
        newList.add("안녕?");
        newList.add(1000);

        // 4) get(): index 값 가져오기
        // 오브젝트에 넣기 가능
        Object r = newList.get(0);
        System.out.println("오브젝트r"+r); //  오브젝트r안녕?

        // 0번째 index 값을 가져와서 출력하세요
        System.out.println( newList.get(0) ); // 안녕?
        System.out.println( newList.get(1) ); // 1000

        // 배열리스트 안에 들어있는 값이 숫자라고 확실할 수 없기에 불가능
        //System.out.println( newList.get(1) + 10 );

        System.out.println("=========================");
        /*********************************************/
        /////////////////////////////////////////
        // 3. 제네릭 사용하여, 요소의 자료형 정해두기
        // 1)  <String>
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("Java");
        System.out.println("add 이후"+strings);

        strings.remove(0); // 0번째 index를 제거하라
        strings.remove("ㅋㅋㅋ"); // ㅋㅋㅋ 값을 제거하라, 없으면 pass
        System.out.println("remove이후"+strings);

        System.out.println("=========================");
        //////////////////////////////////////////////
        // 2)  <Integer>
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(100);
        System.out.println("add 이후"+numbers);

        numbers.remove(0); // 0번째 index를 제거하라
        numbers.remove("Java"); // "Java"를 찾아서 제거하라, 없으면 패스
        System.out.println("remove 이후"+numbers);

        // 만약에 10 숫자를 제거하고 싶다면?
        //numbers.remove(10); 숫자 10이 아니라, index로 작동됨 (int형 10)

        // (integer 10)으로 넣으면 됨
        Integer inte = new Integer(100);
        numbers.remove(inte);


        System.out.println("=========================");
        ArrayList<Integer> newList2 = new ArrayList<>();
        // newList.add("안녕?");
        newList2.add(5555);
        newList2.add(1000);
        newList2.add(55);
        newList2.add(778);
        newList2.add(1);
        System.out.println(newList2);

        // 값을 가져와서 변수에 담기 가능
        int num = newList2.get(1);
        System.out.println("num"+num); // num1000

        // 0번째 index 값을 가져와서 출력하세요
        System.out.println( newList2.get(0) ); // 5000
        System.out.println( newList2.get(1) + 10 ); // 1010

        System.out.println("=========================");
        System.out.println("오름차순 정렬");
        // 오름차순 정렬해주세요
        newList2.sort(null);
        System.out.println(newList2);

        System.out.println("=========================");
        /*******************************************/
        // 객체 형태의 정수
        Integer i1 = 100;
//        Integer j = new Integer(200); // 자바 자체에서 사용을 자제하는 문법
        System.out.println(i1);

        // 숫자는 문자와 더해지면 문자가 된다
        String a = i1 + "abc"; // 숫자 + 문자 = 문자
        System.out.println(a);
        System.out.println("=========================");

        // String1
        String s = "100";
        String[] splitResult = s.split(""); // 공백을 기준으로 문자 나누기
        for (int i = 0; i < splitResult.length; i++) {
            System.out.println(splitResult[i]);
        }

        System.out.println("=========================");
        // String2
        String s2 = "100";
        String[] splitResult2 = s2.split(""); // 공백 기준으로 나누고, array에 담기
        String result = Arrays.toString(splitResult2); // Arrays import해야함
        System.out.println(result);

        System.out.println("=========================");
        // integer => String
        Integer i2 = 100; // 객체 형태의 정수
        String ss1 = i2.toString(); // String 형태로 변경 방법1
        String ss2 = "" + i2; // String 형태로 변경 방법2
        System.out.println(i2);

        System.out.println("=========================");
        // ??? => int or integer
        // String 혹은 int 형이 아닌 다른 형태를 Ingeter 혹은 int형으로 변경
        int z1 = Integer.parseInt("100"); // => int 형으로
        Integer z2 = Integer.valueOf("200"); // => Integer 형으로, (이 방법이 자주쓰임)

        System.out.println("int형"+z1);
        System.out.println("integer형"+z2);
        System.out.println("=========================");


        // char 은 자동 변환되기에 97이 아니라 a가 출력됨
        char c = 97;
        System.out.println(c);



    }
}

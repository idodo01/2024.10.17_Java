package Study_20241023.my_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyStreamMain {
    public static void main(String[] args) {
        /********** 일반 배열에서 stream 가져오기 ******/
        String[] names = new String[]{"김", "이", "박"};
        Stream<String> nameStream = Arrays.stream(names);
        nameStream.forEach(System.out::println);
        /********** collection에서 stream 가져오기 ******/
        List<Integer> numbers = List.of(1,2,3);
        Stream<Integer> numStream = numbers.stream();
        numStream.forEach(System.out::println);
        /*********** 사용자 정의 stream을 생성하기 ********/
        // 1) 여러 요소를 가지는 스트림
        IntStream intStream = IntStream.of(1,2,3);
        intStream.forEach(System.out::println);
        // 2) 범위를 가지는 스트림
        IntStream rangeStream = IntStream.range(1, 10); // 1 ~ 9까지
        rangeStream.forEach(System.out::println);
    }
}

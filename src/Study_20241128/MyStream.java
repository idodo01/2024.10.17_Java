package Study_20241128;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyStream {
    public static void main(String[] args) {
        List<String> strings =
                List.of(
                        "APPLE",
                        "MANGO",
                        "BANANA",
                        "MANGO",
                        "APPLE",
                        "GRAPE",
                        "DRAGON FRUITS");

        // 1.
//        // filter : 길이가 5이상일 때만
//        // distince : 중복 제거
//        strings.stream()
//                .filter( value -> {
//                    if (value.length() <= 5){
//                        return true;
//                    }
//                    return false;
//                } )
//                .distinct()
//                .forEach( value -> {
//                    System.out.println(value);
//                } );

        // 2.

//            strings.stream()
                  // 새로운 stream을 반환해야 한다.
                  // A -> A1, A2 처럼 여러 개의 요소
//            .flatMap( value -> {
//                // value가 mango

//                String[] values = value.split("");
//                return Arrays.stream(values);
//            })
//            .distinct()
//            // 메서드 참조로 print
//            .forEach(System.out::println);

        // 3.
//        strings.stream()
//                // 새로운 객체를 반환하면 된다.
//                // A -> B
//                .map( value -> {
//                    // "MANGO"가 "MAN"로 변한다
//                    return value.substring(0, 3);
//                })
//                .sorted() // 중간처리다!
//                // 메서드 참조로 print
//                .forEach(System.out::println);

        // 4. 숫자 더하기
//        List<String> numbers = List.of("A1","B10","C2","D4");
//        int result = numbers.parallelStream()
//                .mapToInt(value -> {
//                    return Integer.parseInt(value.substring(1));
//                })
//                .sum();
//        System.out.println(result);

        // 5. map를 사용해서 숫자더하기
        List<String> alphabets = List.of("A1","B10","C2","D4");

        Map<String, String> resultAlphas = alphabets.parallelStream()
                .collect(Collectors.toMap(
                        v -> { return v.substring(0, 1); },
                        v -> { return v.substring(1); }
                ));
        System.out.println(resultAlphas);

    }
}

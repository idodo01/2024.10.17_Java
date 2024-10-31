package Study_20241022.my_generic;

import lombok.AllArgsConstructor;


// 1.
@AllArgsConstructor
class CATEGORY_CLASS{
    String name;
}

// 2.
enum CATEGORY_ENUM {
    식품, 장난감, 문구
}


public class MyEnumMain {
    public static void main(String[] args) {

        // 1.
        CATEGORY_CLASS c1 = new CATEGORY_CLASS("식품");
        CATEGORY_CLASS c2 = new CATEGORY_CLASS("장난감");
        CATEGORY_CLASS c3 = new CATEGORY_CLASS("문구");

        switch (c2.name){
            case "식품":
                System.out.println("식품입니다~~~");
                break;
            case "장난감":
                System.out.println("장난감입니다~~~");
                break;
            case "문구":
                System.out.println("문구입니다~~~");
                break;
        }

        /////////////////////////////////////////////////
        // 2. ENUM 사용
        CATEGORY_ENUM ce1 = CATEGORY_ENUM.식품;
        CATEGORY_ENUM ce2 = CATEGORY_ENUM.장난감;
        CATEGORY_ENUM ce3 = CATEGORY_ENUM.문구;
        switch (ce2){
            case 식품:
                System.out.println("식품입니다~~~");
                break;
            case 장난감:
                System.out.println("장난감입니다~~~");
                break;
            case 문구:
                System.out.println("문구입니다~~~");
                break;
        }





    }
}







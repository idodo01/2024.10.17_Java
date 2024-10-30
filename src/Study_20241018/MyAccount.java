package Study_20241018;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
class Account{
    private String no; // 계좌번호
    private String password; // 계좌 비밀번호
    private int balance; // 잔액

    Account(){ // 1. 매개변수 1개인 생성자
        this("NONE", "NONE", 100); // 3번 생성자 실행됨
        System.out.println("1. 매개변수 1개인 생성자 끝");
        //        this(); 자기자신에서는 작성 불가능, 무한루프
    }

    Account(String no, String password, int balance){ // 3. 매개변수 3개인 생성자
        this.no = no;
        this.password = password;
        this.balance = balance;
        System.out.println("3. 매개변수 3개인 생성자 끝");
    }

    Account(String no, String password){ // 2. 매개변수 2개인 생성자
        this(no, password, 100); // 3번 생성자로 실행됨
        System.out.println("2. 매개변수 2개인 생성자 끝");
    }


    // 오버로딩: 매개변수의 개수와 타입에 따라 다르게 작동하는 메서드
    void sum(double a){}
    void sum(int a){}
    //    void sum(int b){} // 오류뜸, 변수 이름은 달라도 똑같은 취급
//    int sum(int a){
//        return 1;         // 오류뜸, 반환형 달라도 똑같은 취급
//    }
}

public class MyAccount {
    public static void main(String[] args) {
        Account daeguBankAccount = new Account("11-555-456789", "1234");
    }
}







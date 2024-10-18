package Study_20241018;

class Account{
    private String no; // 계좌번호
    private String password; // 계좌 비밀번호
    private int balance; // 잔액
    // 계좌번호를 설정(Setting)해 줄 수 있는 메서드 (Setter)
    public void setNo(String no) {
        this.no = no;
    }

    // alt+Insert 단축키로
    // 빠르게 getter setter 만들 수 있음
    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

public class MyAccount {
    public static void main(String[] args) {
        Account daeguBankAccount = new Account();
        daeguBankAccount.setNo("11-555-456789");
        daeguBankAccount.setPassword("1234");
    }
}




package Basic;

class Problem1 {
    private int number;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}


public class P1 {
    public static void main(String[] args) {
        Problem1 p = new Problem1();

        p.setName("Jave");
        p.setNumber(2);

        int sum = p.getNumber() + 5;
        System.out.println("(p객체에 저장되어있는 number) + 5의 객체 : "  + sum);
        System.out.println("저장되어있는 이름 = "+ p.getName());
    }
}

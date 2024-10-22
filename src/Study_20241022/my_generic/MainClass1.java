package Study_20241022.my_generic;

// 제네릭
class CommonData1<Z>{
    private Z data;

    public Z getData() {
        return data;
    }

    public void setData(Z data) {
        this.data = data;
    }
}

public class MainClass1 {
    public static void main(String[] args) {
        CommonData1 cd = new CommonData1();
        cd.setData("안녕하세요"); // 문자열을 넣음
        String result = (String) cd.getData(); // 다운캐스팅해서 넣어야함
        System.out.println(result);
    }
}







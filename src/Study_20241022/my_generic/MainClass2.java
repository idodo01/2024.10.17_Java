package Study_20241022.my_generic;

class CommonData2<Z>{
    private Z data;

    public Z getData() {
        return data;
    }

    public void setData(Z data) {
        this.data = data;
    }
}

public class MainClass2 {
    public static void main(String[] args) {

        CommonData2<Integer> cd = new CommonData2<>(); // Integer로 지정해주면
        cd.setData(50);
        Integer result = cd.getData(); // 별도로 다운 캐스팅 안해도 됨
        System.out.println(result);
    }
}







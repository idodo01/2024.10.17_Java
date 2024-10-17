package Basic;

class Annony {
    void override_method() {
        System.out.println("이 메소드는 오버라이딩 되어야 합니다.");
    }
}

public class P6 {
    public static void main(String[] args) {
        Annony new_annony;
        new_annony = new Annony();

        new_annony.override_method();
    }
}

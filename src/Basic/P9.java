package Basic;

class ParentClass {
    class InnerClass {
        void child_method() {
            System.out.println("parent");
        }
    }
}

public class P9 {
    public static void main(String[] args) {
        ParentClass pc = new ParentClass();
        ParentClass.InnerClass ic = pc.new InnerClass();
        ic.child_method();
    }
}

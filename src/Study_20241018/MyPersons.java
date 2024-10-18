package Study_20241018;

class Person {
    static int population = 0 ;

    Person(String name) {
        System.out.println(name+" is born.");
        population++;
    }
    static int get_population() {
        return population;
    }

}
public class MyPersons {
    public static void main(String[] args) {
        // james is born
        Person man = new Person("james");
        // emily is born
        Person woman = new Person("emily");
        // 전체...
        System.out.println("전체 인구 수: " + Person.get_population());
    }
}

public class Constructor01 {
    public static void main(String[] args) {
        Person p1 = new Person("simith",80);
        System.out.println(p1.name);
        System.out.println(p1.age);
    }
}

class Person {
    String name;
    int age;

    public Person(String PName , int PAge) {
        name = PName;
        age = PAge;
    }
}
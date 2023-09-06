public class ConstructorExercise {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.print(p1.name + "   ");
        System.out.println(p1.age);

        Person p2 = new Person("scott",50);
        System.out.print(p2.name + "   ");
        System.out.println(p2.age);
    }
}

class Person {
    String name;
    int age;

    public Person() {
        age = 18;
    }
    public Person(String pName , int pAge) {
        name = pName;
        age = pAge;
    }
}
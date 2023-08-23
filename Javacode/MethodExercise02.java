public class MethodExercise02 {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "milian";
        p.age = 100;

        MyTools tools = new MyTools();
        Person p2 = tools.copyPerson(p);

        System.out.println(p.name + "\t" + p.age);
        System.out.println(p2.name + "\t" + p2.age);
        System.out.println(p == p2);
    }
}

class Person {
    String name;
    int age;
}

class MyTools {

    public Person copyPerson(Person p) {
        Person p2 = new Person();
        p2.name = p.name;
        p2.age = p.age;

        return p2;
    }
}
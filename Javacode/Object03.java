public class Object03 {
    public static void main(String[] args) {
        Person a = new Person();
        a.price = 10000;
        a.name = "beijing";

        Person b;
        b = a;
        System.out.println(b.name);
        b.price = 200;
        b = null;
        System.out.println(a.price);
        System.out.println(b.price);
    }
}

class Person {
    String name;
    double price;
    String color;
    String[] master;
}
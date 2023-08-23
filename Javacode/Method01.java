public class Method01 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.speak();
        p1.cal01();
    }
}

class Person {
    String name;
    int age;

    public void speak() {
        System.out.println("angelczack");
    }

    public void cal01 (int n) {
        int res = 0 ;
        for(int i = 1; i <= 1000; i++) {
            res += i;
        }
        System.out.println("res= " + res);
    }
}
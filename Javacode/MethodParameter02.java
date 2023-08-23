public class MethodParameter02 {
    public static void main(String[] args) {
        BB b = new BB();
        int[] arr = {1,2,3};
        b.test100(arr);

        for(int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        Person p = new Person();
        p.name = "angelc";
        p.age = 10;

        b.test200(p);
        System.out.println("main's p.age= " + p.age);
    }
}

class Person {
    String name;
    int age;
}

class BB {
public void test200(Person p) {
    p.age = 10000;
}

    public void test100 (int[] arr) {
        arr[0] = 200;

        for(int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
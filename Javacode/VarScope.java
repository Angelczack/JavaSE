public class VarScope {
    public static void main(String[] args) {

    }
}

class Cat {
    int age = 10;
    double weight;

    public void hi() {
        int num = 1;
        String address;
        System.out.println("num=" + num);
    }

    public void cry() {
        int n = 10;
        String name = "jack";
        System.out.println("age is " + age);
    }

    public void eat() {
        System.out.println("age= " + age);
        System.out.println("num= " + num);
    }
}
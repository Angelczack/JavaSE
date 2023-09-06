public class VarScopeDetail {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.say();
    }
}

class Person {
    private int age = 20;
    String name = "jack";

    public void say() {
        String name = "king";
        System.out.println("say() name=" + name);
    }

    public void hi() {
        String address = "beijing";
        String address = "shanghai";
        String name = "hsp"; 
    }
}
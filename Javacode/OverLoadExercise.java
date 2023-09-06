public class OverLoadExercise {
    public static void main(String[] args) {
        Methods method = new Methods();
        method.m(10);
        method.m(10,20);
        method.m("angelc zack");
    }
}

class Methods {
    public void m(int n) {
        System.out.println("n*n = " + (n * n));
    }

    public void m(int n1 , int n2) {
        System.out.println("*=" + (n1 * n2));
    }

    public void m(String str) {
        System.out.println("receive String is " + str);
    }
}
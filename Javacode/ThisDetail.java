public class ThisDetail {
    public static void main(String[] args) {
        // T t1 = new T();
        // t1.f2();
        T t2 = new T(); 
    }
}

class T {
    // public void f1() {
    //     System.out.println("f1");
    // }

    // public void f2() {
    //     System.out.println("f2");
    //     f1();
    //     this.f1();
    // }

    public T() {
        this("jack",100);
        System.out.println("1111");
        
    }
    public T(String name , int age) {
        System.out.println("T()");
    }
}
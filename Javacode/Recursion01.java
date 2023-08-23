public class Recursion01 {
    public static void main(String[] args) {
        CC t1 = new CC();
        t1.test(6);
        int res = t1.factorial(5);
        System.out.println("res= " + res);
    }
}

class CC {
    public void test(int n) {
        if( n > 2) {
            test(n-1);
        }
        System.out.println("n= " + n);
    }

    public int factorial(int n) {
        if(n == 1) {
            return 1;
        }
        else {
            return factorial(n-1) * n;
        }
    }
}
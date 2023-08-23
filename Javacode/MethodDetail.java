public class MethodDetail {
    public static void main(String[] args) {
        AA a = new AA();
        int[] res = a.getSumAndSub(1,4);
        System.out.println("sum= " + res[0]);
        System.out.println("sub= " + res[1]);

        byte b1 = 1;
        byte b2 = 2;
        a.getSumAndSub(b1,b2);
    }
}

class AA {
    public int[] getSumAndSub(int n1, int n2) {

        int [] resArr = new int[2];
        resArr[0] = n1 + n2;
        resArr[1] = n1 - n2;
        return resArr;
    }

    public double f1() {
        double d1 = 1.1 * 3;
        return 1.1;
    }

    // public void f2() {
    //     System.out.println("hellow1");
    //     System.out.println("hellow2");
    //     System.out.println("hellow3");
    //     int n = 10;
    //     return n;
    // } //error
}
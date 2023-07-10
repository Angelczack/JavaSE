public class AssignOperator {
    public static void main(String[] args) {
        int n1 = 10;
        n1 += 4;
        System.out.println(n1);

        n1 /= 3;
        System.out.println(n1);

        int n2 =7 * 8 - 10;
        System.out.println(n2);

        byte b = 3;
        b += 2; // b = (byte)(b+2);
        b++;    //b = (byte)(b + 1);
        System.out.println(b); 
    }
}
public class TernaryOperatorDetail {
    public static void main(String[] args) {
        int a = 3;
        int b = 8;
        int c = a > b ? (int)1.1 : (int)3.4;
        double d = a > b ? a : b + 3;
        System.out.println(c);
        System.out.println(d);
    }
}
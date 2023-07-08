public class forceConvert{
    public static void main(String[] args) {
        int n1 = (int)1.9;
        System.out.println(n1);  //1 lost

        int n2 = 2000;
        byte b1 = (byte)n2;
        System.out.println(b1);  //-48 out
    }
}
public class autoconvertDetail {
    public static void main(String[] args) {
        int n1 = 10; //ok
        //float d1 = n1 + 1.1;  //错误  n1+1.1 => result is double
        double d1 = n1 +1.1;
        float d2 = n1 + 1.1F;
        System.out.println(d1);
        System.out.println(d2);

       // int n2 = 1.1; //error  double -> int

        byte b1 = 10; //correct, -128-127
        int n2 = 1;
       // byte b2 = n2; //error
       //char c1 = b1; //error

       byte b2 = 1;
       byte b3 = 2;
       short s1 = 1;
       // short s2 = b2 + s1; //error b2 + s1 => int
       int s2 = b2 + s1; //correct

       //byte b4 = b2 + b3; //error

       byte b4 = 1;
       short s3 = 100;
       int num200 = 1;
       float num300 = 1.1F;

       double num500 = b4 + s3 + num200 + num300; //float -> int
       System.out.println(num500);



    }
}
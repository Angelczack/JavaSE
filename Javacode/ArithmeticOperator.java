public class ArithmeticOperator {
    public static void main(String[] args) {

        // /
        System.out.println(10 / 4);  //2
        System.out.println(10.0 / 4);  //2.5
        double d = 10 / 4;  //2.0
        System.out.println(d);


        
    // %
    System.out.println(10 % 3); //1
    System.out.println(-10 % 3); //-1
    System.out.println(10 % -3); //1
    System.out.println(-10 % -3); //-1

    // i++ ++i
    int j=8;
    int k = ++j;
    System.out.println("k=" + k + "j=" + j);  //9 9

    int x = 8;
    int y = x++;
    System.out.println("y=" + y + "x=" + x); //8 9
    }
}
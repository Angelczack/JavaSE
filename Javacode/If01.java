import java.util.Scanner;
public class If01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("please input your age");
        int age = myScanner.nextInt();
        if(age > 18) {
            System.out.println("over 18");
        }
        System.out.println("go ahead");
    }
}
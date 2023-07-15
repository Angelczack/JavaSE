import java.util.Scanner;
public class SwitchDetail {
    public static void main(String[] args) {
         Scanner myScanner = new Scanner(System.in);
        System.out.println("please input,range is (a-f)");
        char c1 = myScanner.next().charAt(0);

        switch(c1) {
            case 'a' :
            System.out.println("today is Monday");
            break;
            case 'b' :
            System.out.println("today is Tuesday");
            break;
            case 'c' :
            System.out.println("today is Wednesday"); 
            break;
             default :
            System.out.println("error");
        }
    }
}
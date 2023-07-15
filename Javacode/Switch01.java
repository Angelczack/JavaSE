import java.util.Scanner;
public class Switch01 {
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
            case 'd' :
            System.out.println("today is Thursday"); 
            break;
            case 'e' :
            System.out.println("today is Friday"); 
            break;
            case 'g' :
            System.out.println("today is Saturday"); 
            break;
            case 'f' :
            System.out.println("today is Sunday");
            break;
            default :
            System.out.println("error");
        }
    }
}
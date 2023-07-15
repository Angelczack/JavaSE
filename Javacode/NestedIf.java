import java.util.Scanner;
public class NestedIf{
    public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("please input");
    double score = myScanner.nextDouble();
    if(score > 8.0) {
        System.out.println("please input gender");
        char gender = myScanner.next().charAt(0);
        if(gender == 'm') {
            System.out.println("your will in male group");
        }
        else if(gender == 'w') {
            System.out.println("your will in female group");
        } else {
            System.out.println("error gender");
        }
    }
     else {
        System.out.println("sorry, your out");
    }   
    }
}
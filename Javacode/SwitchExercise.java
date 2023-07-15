import java.util.Scanner;
public class SwitchExercise {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("please input a-e");
        char c1 = myScanner.next() .charAt(0);

        switch(c1) {
            case 'a' :
                System.out.println("A");
                break;
             case 'b' :
                System.out.println("B");
                break;
             case 'c' :
                System.out.println("C");
                break;
             case 'd' :
                System.out.println("D");
                break;
              case 'e' :
                System.out.println("E");
                break;
            default : 
            System.out.println("error");
        }

        System.out.println("please input range is 0-100");
       double score =  myScanner.nextDouble();
       if(score >=0 && score <=100) {
            switch((int)(score / 60)) {
            case 0 :
            System.out.println("not pass");
            break;
                case 1 :
                System.out.println("pass");
                break;
            //     default :
            // System.out.println("")
       }
       }else {
        System.out.println("please reinput range is 0-100");
       }
       
    }
}
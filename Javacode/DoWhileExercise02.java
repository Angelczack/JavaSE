import java.util.Scanner;
public class DoWhileExercise02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        char answer = ' ';
        do{
            System.out.println("get money? y/n");
            answer = myScanner.next().charAt(0);
            System.out.println("answer is " + answer);
        }while(answer != 'y');
    }
}
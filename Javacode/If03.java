import java.util.Scanner;
public class If03{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("please input grade,range is [1-100]");
        int grade = myScanner.nextInt();
if(grade >= 1 && grade <=100) {
      if(grade == 100) {
            System.out.println("perfect");
        }
        else if (grade > 80 && grade <= 99) {
            System.out.println("good");
        }
        else if(grade >= 60 && grade <=80) {
            System.out.println("normal");
        }
        else {
            System.out.println("bad");
        }
    }
    else {
        System.out.println("please reinput");
    }
      
    }
}
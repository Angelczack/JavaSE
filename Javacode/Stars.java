import java.util.Scanner;
public class Stars {
    public static void main(String[] args) {
        // for(int i=1;i<=5;i++) {
        //     for(int j=1;j<=i;j++) {
        //        System.out.print("*");
        //     }
        //     System.out.print('\n');
        // }

    Scanner myScanner = new Scanner(System.in);
    System.out.println("input lines");
            int totalLevel = myScanner.nextInt();
        for(int i=1;i<=totalLevel;i++)
        {
            for(int j = 1; j<=totalLevel-i;j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++) {
                if(k==1 || k == 2*i-1 || i==totalLevel){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }            
            System.out.print('\n');
        }
    }
}
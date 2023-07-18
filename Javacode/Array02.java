import java.util.Scanner;
public class Array02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double scores[] = new double[5];

        for(int i = 0; i < scores.length; i++) {
            System.out.println("input" + (i + 1) + "values");
            scores[i] = myScanner.nextDouble();
        }
        System.out.println("== Arrays values output");
        for(int i = 0; i < scores.length; i++) {
         System.out.println("scores value " +scores[i]);
        }
    }
}
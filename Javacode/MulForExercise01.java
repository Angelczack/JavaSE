import java.util.Scanner;
public class MulForExercise01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double totalScore = 0;
        int passNum = 0;
        int classNum =3;
        int stuNum = 5;
        for(int i=1;i<=classNum;i++) {
         double sum = 0;
        for(int j=1; j<=stuNum;j++) {
            System.out.println(i + " class num " +j);
            double score = myScanner.nextDouble();
            if(score >= 60) {
                passNum++;
            }
            sum += score;
            System.out.println("the score is" + score);
        }
        totalScore += sum;
        System.out.println("sum=" +sum + "average=" + (sum/stuNum));   
        }
        System.out.println("the totalscore is " + totalScore + "the totalaverage is " + totalScore/(classNum*stuNum));
    }
}
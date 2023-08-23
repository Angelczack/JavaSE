import java.util.Scanner;
public class MethodExercise01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        AA a1 = new AA();
        a1.adNums(myScanner.nextInt());
    }
}

class AA{
    public boolean adNums(int num) {
        if(num % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
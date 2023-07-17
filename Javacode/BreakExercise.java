import java.util.Scanner;
public class BreakExercise {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int sum = 0;
        int now = 0;
        for(int i =1; i<= 100; i++) {
            sum += i;
            if(sum > 20) {
                System.out.println("sum > 20 , i=" + i);
                now = i;
                break;
            }
        }
        System.out.println("now=" + now);

        String name = "";
        String passwd = "";
        int chance = 3;
        for(int i = 1; i<=3;i++) {
            System.out.println("please innput name");
            name = myScanner.next();
            System.out.println("please innput passwd");
            passwd = myScanner.next();

            if("Angelczack".equals(name) && "666".equals(passwd)) {
                System.out.println("success login");
                break;
            }

            chance--;
            System.out.println("rest" + chance + "chances");
        }
    }
}
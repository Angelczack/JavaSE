import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("input name");
        String name = myScanner.next();
        System.out.println("input age");
        int age = myScanner.nextInt();
        System.out.println("input salary");
        double salary = myScanner.nextDouble();

        System.out.println("name=" + name +" "+ "age=" + age+ " " + "salary=" + salary);

    }
}
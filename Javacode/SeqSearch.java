import java.util.Scanner;
public class SeqSearch {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

       String[] names = {"angelc","zack","miao","fax"};
       System.out.println("input nums");
       String FindName = myScanner.next();

       int index = -1;
       for(int i = 0; i < names.length; i++) {
                if(FindName.equals(names[i])) {
                    System.out.println("find " + FindName);
                    System.out.println("index is " + i);

                index = i;
                break;
            }
        }
        if(index == -1) {
            System.out.println("Sorry,not find...   " + FindName);
        }
    }
}
import java.util.Scanner;
public class ArrayAdd02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] arr = {1,2,3};
        do{ 
        int[] arrNew = new int[arr.length+1];
        for(int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        System.out.println("please input elements");
        int addNum =  myScanner.nextInt();
        arrNew[arrNew.length-1] = addNum;
        arr = arrNew;

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            }
            System.out.print('\n');
        System.out.println("go on? y/n");
        char key = myScanner.next().charAt(0);
        if(key == 'n') {System.out.println("bye~");break;}
        }while(true);
    }
}
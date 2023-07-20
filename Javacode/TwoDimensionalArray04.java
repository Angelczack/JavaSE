public class TwoDimensionalArray04 {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{8,8,9},{100}};

        for(int i = 0; i <arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
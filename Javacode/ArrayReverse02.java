public class ArrayReverse02 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66};
        int[] arr2 = new int[arr.length];
        for(int i=arr.length-1; i>0; i--) {
            arr2[i] = arr[i];
        }
        for(int i=arr.length-1; i>0; i--) {
            System.out.print(arr2[i] + " ");
        }
    }
}
public class ArrayExercise02 {
    public static void main(String[] args) {
        int[] arr = {3,-1,9,10,23};
        int max = arr[0];
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("the max num is " + max);
    }
}
public class ArrayDetail {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,60};

        String[] arr3 = {"angelc","zack","fax"};

        short[] arr4 = new short[3]; 
        for( int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }

        int arr[] = new int[5];
        System.out.println(arr[4]);  // max index is arr.length-1
    } 
}
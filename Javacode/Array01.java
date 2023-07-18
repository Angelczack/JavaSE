public class Array01 {
    public static void main(String[] args) {
        double[] hens = {3,5,1,3.4,2,50};
        double totalWeight = 0;
        for(int i = 0; i < hens.length; i++) {
            System.out.println("the" + (i+1) + "value is" + hens[i] );
            totalWeight += hens[i];
        }
            System.out.println("totalWeight is " + totalWeight);
            System.out.println("average weight is " + totalWeight/hens.length);
    }
}
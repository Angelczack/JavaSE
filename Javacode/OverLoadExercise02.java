public class OverLoadExercise02 {
    public static void main(String[] args) {
        Methods method = new Methods();
       System.out.println(method.max(10,20));
       System.out.println(method.max(10,2,20.4));
       System.out.println(method.max(10,20,30));
    }
}

class Methods {
    public int max(int n1 , int n2) {
        return n1 > n2 ? n1 : n2;
    }

    public double max(double n1 , double n2 , double n3) {
        double max1 = n1 > n2 ? n1 : n2;
        return max1 > n3 ? max1 : n3;
    }
}
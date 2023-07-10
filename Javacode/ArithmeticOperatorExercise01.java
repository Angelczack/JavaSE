public class ArithmeticOperatorExercise01 {
    public static void main(String[] args) {
        int i = 1;
        i = i++;
        //temp = i; i=i+1 i =temp
        System.out.println(i);

        int j = 1;
        j = ++i;
        //i=i+1; temp=i; i=temp;
        System.out.println(j);


        int i1 = 10; //11
        int i2 = 20;
        int is = i1++; //10
        System.out.println("is=" + is); //10
        System.out.println("i2=" + i2);//20
        is= --i2; 
        System.out.println("is=" + is); //19
        System.out.println("i2=" + i2); //19
    }
}
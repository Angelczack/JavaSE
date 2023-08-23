public class RecursionExercise01 {
    public static void main(String[] args) {
        DD d1 = new DD();
        int res = d1.Fibonacci(7);
        if(res != -1) {
        System.out.println(res);

        int day = 1;
        int peachNum = d1.peach(day);
        if(peachNum != -1) {
            System.out.println(day+"day"+peachNum+"nums");
        }
        }
    }
}

class DD {
    public int Fibonacci(int n) {
            if( n >= 1) {
               if( n == 1 || n == 2 ) {
                return 1;
            }
            else {
                return Fibonacci(n-1) + Fibonacci(n-2);
            } 
        }   
        else{
            System.out.println("error");
            return -1;
        }  
    }

    public int peach(int day) {
        if(day == 10) {
            return 1;
        }else if(day >= 1 && day <= 9 ) {
            return (peach(day+1)+1) * 2;
        } 
        else {
            System.out.println("range is 1-10");
            return -1;
        }
    }
}
public class ArithmeticOperatorExercise02 {
    public static void main(String[] args) {
       //request: if we rest 59 days to relax,how many weeks and
       //days to transfer
       
       int days = 59;
       int week;
       int restdays;

       week = days / 7;
       restdays = days % 7;

       System.out.println("rest week " +" "+ week + " " + "rest day " +" "+ restdays);
    }
}
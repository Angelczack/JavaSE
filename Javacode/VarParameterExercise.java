public class VarParameterExercise {
    public static void main(String[] args) {
        HspMethod hm = new HspMethod();
        System.out.println(hm.showScore("miaolan",90.1,80.0));
    }
}

class HspMethod {
    public String showScore(String name , double... scores) {
        double totalScore = 0;
        for( int i = 0 ; i < scores.length; i++) {
            totalScore += scores[i];
        }
        return name + " have " + scores.length+ " classes " + "the totalscore is " + totalScore;
    }
}
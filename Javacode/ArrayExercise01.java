public class ArrayExercise01 {
    public static void main(String[] args) {
        char[] str = new char[26];
        for(int i=0; i<str.length;i++) {
           str[i] = (char)('A'+ i);
           System.out.print(str[i]);
        }
    }
}
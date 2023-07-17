public class Return01 {
    public static void main(String[] args) {
        for( int i=1; i<=5;i++) {
            if(i == 3) {
                System.out.println("angelc" + i);
                break;
            }
            System.out.println("hello angelc");
        }
        System.out.println("go on...");
        System.out.print('\n');
        System.out.print('\n');
        System.out.print('\n');
        for( int i=1; i<=5;i++) {
            if(i == 3) {
                System.out.println("angelc" + i);
                continue;
            }
            System.out.println("hello angelc");
        }
        System.out.println("go on...");
    }
}
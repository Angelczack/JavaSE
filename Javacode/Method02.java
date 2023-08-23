public class Method02 {
    public static void main(String[] args) {
        int [][] map = {{0,0,1},{1,1,1},{1,1,3}};
        // for(int i = 0 ; i < map.length; i++) {
        //     for(int j = 0; j <map[i].length; j++) {
        //         System.out.print(map[i][j] + " ");
        //     }
        //     System.out.print("\n");
        // }
        Mytools tool = new Mytools();
        tool.printArr(map);
    }
}

class Mytools {
    public void printArr(int[][] map) {
        for(int i = 0 ; i < map.length; i++) {
            for(int j = 0; j <map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
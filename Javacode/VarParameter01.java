public class  VarParameter01 {
    public static void main(String[] args) {
        HspMethod hspmethod = new HspMethod();
        System.out.println(hspmethod.sum(10,20,30));
        System.out.println(hspmethod.sum(10,20));
    }
}

class HspMethod {
    public int sum(int ... nums) {
        // System.out.println("nums = " + nums.length);
        int res = 0;
        for(int  i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        return res; 
    }
}
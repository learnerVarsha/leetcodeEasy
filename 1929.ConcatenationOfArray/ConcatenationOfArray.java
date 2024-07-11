public class ConcatenationOfArray {
    public int[] concateArr(int nums[]){
        int n = nums.length;
        int ans[] = new int[n*2];
        for(int i=0; i<n; i++){
            ans[i+n] = ans[n] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args){
        ConcatenationOfArray obj = new ConcatenationOfArray();
        System.out.println(obj.concateArr(new int[]{1, 2, 1}));
    }
}

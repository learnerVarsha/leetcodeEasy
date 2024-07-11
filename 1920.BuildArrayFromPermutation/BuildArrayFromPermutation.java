public class BuildArrayFromPermutation {
    // with space complexity of O(1)
    public int[] buildArray(int[] nums){
        int n = nums.length;
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i] + (nums[nums[i]]%n) * n;
        }
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i]/n;
        }
        return nums;
    }

    public static void main(String[] args){
        int[] nums = {0,2,1,5,3,4};
        BuildArrayFromPermutation obj = new BuildArrayFromPermutation();
        int[] ans = obj.buildArray(nums);
        for(int num: ans){
            System.out.println("" + num);
        }
        
    }
}

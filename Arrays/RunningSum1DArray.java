public class RunningSum1DArray {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] runningSum = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                runningSum[i]=runningSum[i]+nums[j];
            }
        }
        return runningSum;
    }
}

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int n=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                    if(count==2){
                        break;
                    }
                }
            }
            if(count==2){
                count=0;
            }else{
                n=nums[i];
                break;
            }
        }
        return n;
    }
}

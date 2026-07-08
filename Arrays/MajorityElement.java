public class MajorityElement {
    class Solution {
    public int majorityElement(int[] nums) {
        int num=-1;        
        int count=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=num){
                int count1=0;
                int a=0;
                for(int j=0;j<nums.length;j++){
                    if(nums[j]==nums[i]){
                        a = nums[j];
                        count1++;
                    }                
                }
                if(count1>count){
                    num=a;
                    count=count1;
                }
            }
        }
        return num;  
    }
}
}

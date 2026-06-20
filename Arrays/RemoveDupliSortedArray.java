public class RemoveDupliSortedArray {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int ue=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=ue){
                ue=nums[i];
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}

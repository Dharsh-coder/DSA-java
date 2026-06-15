public class FindNumberWithEvenNumberOfDight {
    public int findNumbers(int[] nums) {
        int n=0;
        for(int x:nums){
            int count=0;
            while(x>0){
                x=x/10;
                count++;
            }
            if(count%2==0){
                n++;
            }
        }
        return n;
    }
}

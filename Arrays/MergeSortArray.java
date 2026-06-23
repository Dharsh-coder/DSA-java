import java.util.Arrays;

public class MergeSortArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = nums1.length;
        if(m==0){
            for(int i=0;i<a;i++){
                nums1[i]=nums2[i];
            }
        }
        int pos=0;
        if(m!=0 && n!=0){
            for(int i=m;i<a;i++){
                nums1[i]=nums2[pos];
                pos++;
            }
            Arrays.sort(nums1);
        }
    }
}

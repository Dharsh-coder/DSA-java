import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> num = new HashSet<>();
        for(int x : nums){
            if(num.contains(x)) return true;
            num.add(x);
        }
        return false;
    }
}

package Strings;

public class LengthOfLastWord {
    class Solution {
    public int lengthOfLastWord(String s) {
        int space=0;
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(Character.isAlphabetic(s.charAt(i))){
                count++;
            }
            else{
                space++;
                if(count>0){
                    break;
                }
            }
        }
        return count;
    }
}
}

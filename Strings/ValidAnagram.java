package Strings;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int lenS = s.length();
        int lenT = t.length();
        boolean result=true;
        if(lenS != lenT){
            result=false;
        }else{
        char[] sA = s.toCharArray();
        char[] tA = t.toCharArray();

        Arrays.sort(sA);
        Arrays.sort(tA);
        if(Arrays.equals(sA,tA)){
            result=true;
        }else{
            result=false;
        }
        }
        return result;
    }
}

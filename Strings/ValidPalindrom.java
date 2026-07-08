package Strings;

public class ValidPalindrom {
    class Solution {
    public Boolean isPalindrome(String s) {
        String str=s.toLowerCase();
        String newstr = "";
        for(int i=0;i<str.length();i++){
            boolean b1 = Character.isDigit(str.charAt(i));
            boolean b = Character.isAlphabetic(str.charAt(i));
            if(b1 || b){
                newstr+=str.substring(i,i+1);
            }
        }
        String newstr2="";
        for(int i = newstr.length()-1;i>=0;i--){
            newstr2 += newstr.substring(i,i+1);
        }
        if(newstr.equals(newstr2)){
            return true;
        }else{
            return false;
        }
    }
}
}

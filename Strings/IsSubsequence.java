package Strings;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int count=-1;
        int lastcount=-1;
        boolean flag = false;
        if(s.length()==0){
            flag=true;
        }
        else{
        for(int i=0;i<s.length();i++){
            for(int j=count+1;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    if(count<=j){
                        count=j;
                        flag=true;
                        break;
                    }else{
                        flag=false;
                        break;
                    }
                }
            }
            if(flag==false){
                break;
            }
            if(count>lastcount){
                lastcount=count;
            }else{
                flag=false;
                break;
            }
        }
        }
        return flag;
    }
}

import java.util.HashSet;

public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
       if(s.length()==0) return 0;
       int pre=0;
       int cur=1;
       int res=0;
       while (cur<s.length()){
           res = Math.max(res,cur-pre);
           String tmp=s.substring(pre,cur);
           if(tmp.contains(s.charAt(cur)+"")) pre=s.indexOf(s.charAt(cur),pre)+1;
           cur++;
       }

    return Math.max(res,cur-pre);
    }

}

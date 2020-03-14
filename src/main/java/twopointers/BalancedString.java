package twopointers;/*假如在该字符串中，这四个字符都恰好出现 n/4 次，那么它就是一个「平衡字符串」。给你一个这样的字符串 s，请通过「替换一个子串」的方式，使原字符串 s 变成一个「平衡字符串」。
你可以用和「待替换子串」长度相同的 任何 其他字符串来完成替换。
请返回待替换子串的最小可能长度。
如果原字符串自身就是一个平衡字符串，则返回 0。
示例 1：输入：s = "QWER"
        输出：0
        解释：s 已经是平衡的了。*/
import java.util.HashMap;

public class BalancedString {
    public boolean check(HashMap<Character,Integer> map,int tag){
        for(char ch: map.keySet()){
            if(map.get(ch)>tag) return false;
        }
        return true;
    }
    public int balancedString(String s) {
        int n=s.length();
        int tag=n/4;
        int res=Integer.MAX_VALUE;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        if(check(map,tag)) return 0;
        int j=0;
        for(int i=0;i<n;i++){
            map.put(s.charAt(i),map.get(s.charAt(i))-1);
            while(check(map,tag)){
                res=Math.min(res,i-j+1);
                map.put(s.charAt(j),map.get(s.charAt(j))+1);
                j++;
            }
        }
        return res;
    }
}

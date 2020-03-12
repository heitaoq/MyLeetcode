package TwoPointers;

import java.util.HashMap;
import java.util.HashSet;

/*给定一个字符串 s ，找出 至多 包含两个不同字符的最长子串 t
        示例 1:
        输入: "eceba"
        输出: 3
        解释: t 是 "ece"，长度为3。

        示例 2:
        输入: "ccaabbb"
        输出: 5
        解释: t 是 "aabbb"，长度为5。*/
public class LengthOfLongestSubstringTwoDistinct {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
    int result=0;
    int i=0;
    int j=0;
    HashMap<Character,Integer> hashMap=new HashMap<>();
    while(j>=i&&j<s.length()){
        if(hashMap.keySet().contains(s.charAt(j))) {
            int tmp=hashMap.get(s.charAt(j));
            hashMap.put(s.charAt(j),tmp+1);
        }
        else {
            while(hashMap.keySet().size()==2){
                if(hashMap.get(s.charAt(i))==1){
                    hashMap.remove(s.charAt(i));
                }
                else {
                    hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))-1);
                }
                i++;
            }
            hashMap.put(s.charAt(j),1);
        }
        j++;
        result=Math.max(result, j-i);
    }
    return result;
    }
}

package backtracking;

import java.util.HashSet;
import java.util.Set;

/*面试题38. 字符串的排列
输入一个字符串，打印出该字符串中字符的所有排列。
* */
public class Permutation {
    Set<String> set=new HashSet<>();
    public String[] permutation(String s) {
        if(s==null) return new String[]{};
        boolean[] visited=new boolean[s.length()];
        recur(s,"",visited);
        return set.toArray(new String[set.size()]);

    }
    void recur(String s,String str,boolean[] visited){
        if(str.length()==s.length()) {
            set.add(str);
            return;
        }
        for(int i=0;i<s.length();i++){
            if(visited[i]) continue;
            visited[i]=true;
            recur(s,str+String.valueOf(s.charAt(i)),visited);
            visited[i]=false;
        }
    }
}

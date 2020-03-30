package offer;
/*输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。
为简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student. "，则输出"student. a am I"。
*/
public class ReverseWords {
    public String reverseWords(String s) {
       String[] strs= s.trim().split(" +");
       StringBuilder sb= new StringBuilder();
       for(int i=strs.length-1;i>=0;i--){
           sb.append(strs[i]);
           sb.append(" ");
       }
       return sb.toString().trim();
    }
}

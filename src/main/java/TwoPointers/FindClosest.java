package TwoPointers;/*有个内含单词的超大文本文件，给定任意两个单词，找出在这个文件中这两个单词的最短距离(相隔单词数)。如果寻找过程在这个文件中会重复多次，而每次寻找的单词不同，你能对此优化吗?
        输入：words = ["I","am","a","student","from","a","university","in","a","city"], word1 = "a", word2 = "student"
        输出：1*/

public class FindClosest {
    public int findClosest(String[] words, String word1, String word2) {
       int pos1=-1;
       int pos2=-1;
       int min=Integer.MAX_VALUE;
       for(int i=0;i<words.length;i++){
           if(words[i].equals(word1)){
               pos1=i;
           }
           if(words[i].equals(word2)){
               pos2=i;
           }
           if(pos1!=-1&&pos2!=-1){
               min=Math.min(Math.abs(pos1-pos2),min);
           }
       }
       return min;
    }
}

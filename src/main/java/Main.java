import breadthfirstsearch.ListOfDepth;
import breadthfirstsearch.ListOfDepth.TreeNode;

import java.util.Scanner;


public class Main {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String str=in.next();
        if(removeDouble(str)==true) System.out.println("Yes");
        else System.out.println("No");
    }
    public static boolean removeDouble(String str){
        if(str==null|| str.length()==0) return true;
        int left=0;
        int right=left+1;
        while(right<str.length()){
            if(str.charAt(left)==str.charAt(right)){
                str=str.substring(0,left)+str.substring(right+1,str.length());
                left=left>0?left-1:0;
                right=left+1;
            }else {
                right++;
                left++;
            }
        }
        if(str.length()>0) return false;
        else return true;
    }
}

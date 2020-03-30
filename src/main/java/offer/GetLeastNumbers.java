package offer;
/*难度
输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，
则最小的4个数字是1、2、3、4。*/

public class GetLeastNumbers {
    public int[] getLeastNumbers(int[] arr, int k) {
    if(k>arr.length) return null;
    if(k==arr.length) return arr;
    if(k==0) return new int[0];
    int[] head=new int[k];
    for(int i=0;i<k;i++){
        head[i]=arr[i];
    }
    buildHead(head);
    for(int i=k;i<arr.length;i++){
        if(arr[i]<head[0]){
            head[0]=arr[i];
            adjust(head,0);
        }
    }
    return head;
    }
    public void buildHead(int[] head){
        int len=head.length-1;
        int partent=(len-1)/2;
        while(partent>=0){
            adjust(head,partent--);
        }
    }
    public void adjust(int[] arr,int i){
        int len=arr.length;
        if(i>=len) return;
        int left=((i << 1) + 1);
        int right=((i << 1) + 2);
        int max=i;
        if(left<len&&arr[max]<arr[left]) max=left;
        if(right<len&&arr[max]<arr[right]) max=right;
        if(max != i) {
            arr[i] = arr[i] + arr[max] - (arr[max] = arr[i]);
            adjust(arr,max);
        }
    }
}

package offer;

public class Search {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]<=target) left=mid+1;
            else right=mid-1;
        }
        int j=left;
        left=0;right=nums.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if(nums[mid]>=target) right=mid-1;
            else left=mid+1;
        }
        int i=right;
        return j-i-1;
    }
}

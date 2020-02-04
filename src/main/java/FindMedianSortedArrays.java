//https://www.cnblogs.com/ysw-go/p/11416950.html

public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        if(m==0){
            if(n%2==1){
                return nums2[n/2]*1.0;
            }
            else return (nums2[n/2-1]+nums2[n/2])/2.0;
        }
        if(n==0){
            if(m%2==1){
                return nums1[m/2]*1.0;
            }
            else return (nums1[m/2-1]+nums1[m/2])/2.0;
        }
        int total=n+m;
        if(total%2==1){
            return findKthMid(nums1,0,nums2,0,total/2+1);
        }else
            return (findKthMid(nums1,0,nums2,0,total/2)+findKthMid(nums1,0,nums2,0,total/2+1))/2;
    }

    public double findKthMid(int[] nums1,int a_start,int[] nums2,int b_start,int k){
        if(a_start>=nums1.length) return nums2[b_start+k-1];
        if(b_start>=nums2.length) return nums1[a_start+k-1];
        if(k==1) return Math.min(nums1[a_start],nums2[b_start])*1.0;
        int mid_a=Integer.MAX_VALUE;
        int mid_b=Integer.MAX_VALUE;
        if(a_start+k/2-1<nums1.length) mid_a=nums1[a_start+k/2-1];
        if(b_start+k/2-1<nums2.length) mid_b=nums2[b_start+k/2-1];
        if(mid_a<mid_b){
           return findKthMid(nums1,a_start+k/2,nums2,b_start,k-k/2);
        }
           return findKthMid(nums1,a_start,nums2,b_start+k/2,k-k/2);
    }
}

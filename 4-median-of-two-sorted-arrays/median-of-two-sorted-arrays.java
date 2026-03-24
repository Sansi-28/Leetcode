class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l=nums1.length+nums2.length;
        
        int[] arr=new int[nums1.length+nums2.length];
                int j=0;
        int k=0;
        int x=(nums1.length<=nums2.length)?nums2.length:nums1.length;
        int i=0;
            while(i<nums1.length&&k<nums2.length){
            if (nums1[i]<=nums2[k]){
                arr[j++]=nums1[i++];
            }
            else arr[j++]=nums2[k++];
            }
                        while(i<nums1.length){
                    arr[j++]=nums1[i++];
            }
            while(k<nums2.length)
                arr[j++]=nums2[k++];
        // int mid = (nums1.length+nums2.length)/2;
        double ans;
        if(l%2==0){
            ans= (arr[l/2]+arr[(l/2)-1])/2.0;
        }
        else ans=arr[(l-1)/2];
        return ans;

    }
}
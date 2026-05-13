class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0){
            return;
        }

        int k = m+n-1;
        int i = m-1;
        int j = n-1;

        while(i>=0 || j>=0){
            if(i<0){
                nums1[k--] = nums2[j--];continue;
            }

            if(j<0){
                nums1[k--] = nums1[i--];continue;
            }

            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i--];
            }else if(nums1[i] <= nums2[j]){
                nums1[k] = nums2[j--];
            }
            k--;
        }
        
    }
}
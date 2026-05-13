class Solution {
    public int partition(int[] nums, int low, int high){
        int i = low + 1;
        int j = high;
        int piv = nums[low];
        while(true){
            while(i<=high && nums[i] < piv){
                i++;
            }

            while(j>low && nums[j] >= piv){
                j--;
            }

            if(i<j){
                int swap = nums[j];
                nums[j] = nums[i];
                nums[i] = swap;
                // System.out.println(nums[i]+" "+nums[j]);
            }else{
                break;
            }
        }

        int swap = nums[j];
        nums[j] = nums[low];
        nums[low] = swap;
        return j;
    }
    public void quickSort(int[] nums, int low, int high){
        if(low < high){
            int k = partition(nums, low, high);
            quickSort(nums, low, k-1);
            quickSort(nums, k+1, high);
        }
    }
    public int[] sortArray(int[] nums) {
        quickSort(nums,0,(nums.length)-1);
        return nums;
    }
}
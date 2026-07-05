class Solution {
    public int[] getCount(int[] nums, int one, int two){
        int countOne = 0;
        int countTwo = 0;
        for(int x: nums){
            if(x == one){
                countOne++;
            }else if(x == two){
                countTwo++;
            }
        }
        return new int[]{countOne, countTwo};
    }
    public List<Integer> majorityElement(int[] nums) {
        if(nums.length == 1){
            return new ArrayList<>(List.of(nums[0]));
        }
        int countOne = 0;
        int countTwo = 0;
        int num1=0, num2=0;

        for(int i = 0;i<nums.length;i++){
            if(nums[i] == num1){
                countOne++;
            }else if(nums[i] == num2){
                countTwo++;
            }else if(countOne == 0){
                num1 = nums[i];
                countOne = 1;
            }else if(countTwo == 0){
                num2 = nums[i];
                countTwo = 1;
            }else{
                countOne--;
                countTwo--;
            }
        }
        List<Integer> ans = new ArrayList<>();

        int[] count = getCount(nums,num1, num2);
        if(count[0] > nums.length/3){
            ans.add(num1);
        }

        if(count[1] > nums.length/3){
            ans.add(num2);
        }
        return ans;
    }
}
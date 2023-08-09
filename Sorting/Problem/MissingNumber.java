package Sorting.Problem;

class MissingNumber {
    public int missingNumber(int[] nums) {

        int i = 0;
        while(i < nums.length){

            int index = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[index]){
                swap(nums,i, index);
            }
            else{
                i++;
            }
        }

        for(int j = 0; j<nums.length; j++){

            if(nums[j] != j){
                return j;
            }

        }

        return nums.length;
        
    }

    public void swap(int[] nums, int row, int col){
        int temp = nums[row];

        nums[row]  = nums[col];

        nums[col] = temp;
    }
}
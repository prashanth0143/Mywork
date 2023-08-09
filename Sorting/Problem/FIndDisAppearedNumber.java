package Sorting.Problem;

import java.util.ArrayList;
import java.util.List;

//find all dupblicate in an Array;
public class FIndDisAppearedNumber {
    public static void main(String[] args) {

        int [] nums = {4,3,2,7,8,2,3,1};

        List<Integer> list = sort(nums);

        System.out.println(list);




    }

    static List<Integer> sort(int[] nums){

        //sort
        int i = 0;

        while(i < nums.length){

            int index = nums[i] - 1;

            if(nums[i] != nums[index]){

                swap(nums, i, index);
            }
            else{
                i++;
            }
        }

        List<Integer> list =  new ArrayList<>();

        for (int j = 0; j < nums.length; j++) {

            if(nums[j] != j+1){
                list.add(nums[j]);
            }


        }

        return list;
    }


    static void swap(int[] a, int row, int col){

        int temp = a[row];
        a[row] = a[col];
        a[col] = temp;
    }
}
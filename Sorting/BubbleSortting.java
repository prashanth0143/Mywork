package Sorting;

import java.util.Arrays;

public class BubbleSortting {
    public static void main(String[] args) {
        int a[] = {-1,5,-17,0,85};

        sort(a);

        System.out.println(Arrays.toString(a));
    }
    
    
    //BubbleSort
    
    static void sort(int[] num){

        for (int i = 0; i < num.length; i++) {

            for (int j = 1; j < num.length-i; j++) {

                if(num[j] < num[j -1]){
                    swap(num,j ,j-1);
                }

            }
            
        }
    }


    static void swap(int[]a,int row, int col){
        int temp = a[row];
        a[row] = a[col];
        a[col] = temp;

    }
}

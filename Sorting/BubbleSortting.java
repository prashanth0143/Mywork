package Sorting;

import java.util.Arrays;

public class BubbleSortting {
    public static void main(String[] args) {
        int a[] = {5,2,1,4,3};

        //sort(a);

        cyclicSort(a);

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


    //cyclic sort

    static void cyclicSort(int[] a){

        int i = 0;

        while (i < a.length){
            int check = a[i] - 1;
            if(a[i] == a[check]){
                i++;
            }
            else {
                swap(a,i,check);
            }
        }
    }
}

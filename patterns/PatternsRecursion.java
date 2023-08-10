package patterns;

import java.util.Arrays;

public class PatternsRecursion {
    public static void main(String[] args) {
       // triange(4,0);

        int [] num = {4,3,2,1,5,6,8};

        System.out.println(Arrays.toString(mergeSort(num,0,num.length-1)));



        //sortWithRecurstion(num,num.length-1,0);

        //selectionWithRecursion(num,0,num.length-1);

        System.out.println(Arrays.toString(num));

    }

    static void triange(int row, int col){

        if(row == 0 ){
            return;
        }

        if(col < row){
            System.out.print("*");
            triange(row,col+1);
        }
        else {
            System.out.println();
            triange(row-1,0);
        }
    }

    static void sortWithRecurstion(int[] num, int row, int col){

        if(row == 0){
            return;
        }

        if(col < row){
            if(num[col] > num[col+1]){
                swap(num,col,col+1);
            }
            sortWithRecurstion(num,row,col+1);
        }

        else{
            sortWithRecurstion(num,row-1,0);
        }
    }

    static void swap(int[] num, int s, int e){

        int temp = num[s];
        num[s] =  num[e];
        num[e] = temp;
    }

    //selection sort

//    static void selectionWithRecursion(int[] num, int row ,int col){
//        if(row  == num.length-1 ){
//            return;
//        }
//
//        if(col > row){
//            //findMax;
//            int max = findMax(num);
//            swap(num,max,col);
//            selectionWithRecursion(num,row,col-1);
//        }
//        else {
//            selectionWithRecursion(num,row+1,0);
//        }
//
//
//    }
//
//    static int findMax(int[] num){
//        int max= 0;
//
//        for (int i = 0; i < num.length; i++) {
//            if(num[i] > max){
//                max = num[i];
//            }
//        }
//        return max;
//    }


    static int[] mergeSort(int[] num, int start, int end){

        if(num.length == 1){
            return num;
        }

        int mid = (end+start) / 2 ;

        int[] left = mergeSort(num,start,mid);

        int[] right = mergeSort(num,mid+1,end);

        return merge(left,right);
    }

    static int[] merge(int[]a, int[]b){
        int[] mix = new int[a.length + b.length];

        for (int i = 0; i < mix.length; i++) {

            if(a[i] < b[i]){
                mix[i] = a[i];
            }
            else {
                mix[i] = b[i];
            }


        }

        return mix;
    }
}

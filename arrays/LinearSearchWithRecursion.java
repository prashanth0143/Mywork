package arrays;

import java.util.ArrayList;

public class LinearSearchWithRecursion {
    public static void main(String[] args) {
        int[ ] num = {5,8,6,12,45,45,20,45};

        int[ ] zero = {4,5,6,7,8,1,2,3};

        int target  = 8;

        System.out.println(binaryWithRotatedArray(zero,target,0, zero.length-1));

//        ArrayList<Integer> list = new ArrayList<>();
//
//        ArrayList<Integer> ans =  bodyList(num, target,0);
//
//        System.out.println(ans);

        //int ans = findTarget(num,target,0);
//
//        int ans1 = iteration(num,target,-1);
//
//        System.out.println(ans1);
    }

    static int findTarget(int[] num, int target, int index){

        if(index >= num.length){
            return -1;
        }
        if(num[index] == target){
            return index;
        }

        return findTarget(num,target,index+1);
    }

    static int iteration(int[] num, int target, int index){

        for (int i = 0; i < num.length; i++) {

            if(num[i] == target){
                index = i;
            }

        } return index;
    }


    static ArrayList<Integer> returnWithList(int[] num, int target, int index, ArrayList<Integer> list){
        if(index == num.length){
            return list;
        }

        if(num[index] == target ){
            list.add(index);
        }

        return returnWithList(num, target,index+1, list);
    }


    static ArrayList<Integer> bodyList(int[] num, int target, int index){
        ArrayList<Integer> list =  new ArrayList<>();

        if(index == num.length){
            return list;
        }

        if(num[index] ==  target){
            list.add(index);
        }

        ArrayList<Integer> list1 =  bodyList(num, target,index+1);

        list.addAll(list1);

        return list;
    }

    static int binaryWithRotatedArray(int[] num, int target , int start, int end){

        if(start  > end){
            return  -1;
        }

        int mid =  (end+start) / 2;

        if(target == num[mid]){
            return mid;
        }
        if(num[start] < num[mid] && target >= num[start]){
            return binaryWithRotatedArray(num,target,start,mid-1);
        }
        else {
            return binaryWithRotatedArray(num,target,mid+1,end);
        }



    }
}

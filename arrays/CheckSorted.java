package arrays;

public class CheckSorted {
    public static void main(String[] args) {
        int [] a = {1,8,3,4,5};

        System.out.println(checkSortedOrNot(a,0));
    }

    static boolean checkSortedOrNot(int [] a, int index){
        if(index == a.length-1){
            return true;
        }

        return a[index] < a[index+1] && checkSortedOrNot(a,index+1);
    }
}

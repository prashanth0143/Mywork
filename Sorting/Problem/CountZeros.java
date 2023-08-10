package Sorting.Problem;

public class CountZeros {
    public static void main(String[] args) {
        int n = 1020305;
    int ans = countZer0(n,0);

        System.out.println(ans);
    }

    static int countZer0(int n, int count){

        if(n == 0){
         return count;
        }

        if(n % 10 == 0){
            count+=1;
        }

       return countZer0(n / 10,count);

    }
}

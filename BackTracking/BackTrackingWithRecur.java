package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class BackTrackingWithRecur {
    public static void main(String[] args) {

    boolean[] [] maze = {
            {true,true,true},
            {true,true,true},
            {true,true,true},
    };

    int [][]path = new int[maze.length][maze.length];

   // realBackTracking("", maze,0,0);

    realBackTracking2("" , maze,path,1,0,0);

    }


    static int threeDArray(int row , int col){
        if(row == 2 || col == 2){
            return 1;
        }

        int count = 0;
         count +=threeDArray(row+1, col);

           count +=  threeDArray(row, col+1);


        return count;

    }

    static ArrayList<String> threeD(String empty, int row , int col){

        if(row == 2 && col == 2){
            ArrayList<String> list = new ArrayList<>();
            list.add(empty);
            return list;
        }

        ArrayList<String> ls =  new ArrayList<>();
        if(row < 2){
            ls.addAll(threeD(empty + 'D',row +1, col));
        }

        if(col < 2 ){
            ls.addAll(threeD(empty + "R", row, col +1));
        }
        return ls;
    }


    static void realBackTracking(String empty, boolean[][] res, int row, int col){

        if(row == res.length -1 && col == res[row].length-1){

            System.out.println(empty);
            return;
        }



        if(!res[row][col]){
            return;
        }

        res[row][col]  = false;
            if(row < res.length-1){
                realBackTracking(empty+"D", res,row +1, col);
            }

            if(col < res[row].length-1){
                realBackTracking(empty+"R", res, row,col +1 );
            }

            if(row > 0){
                realBackTracking(empty + "U",res,row -1, col);
            }

            if(col > 0){
                realBackTracking(empty+ "L", res, row, col-1);
            }

        res[row][col] = true;


    }

    static void realBackTracking2(String empty, boolean[][] res,int[][] path,int step, int row, int col){

        if(row == res.length -1 && col == res[row].length-1){
            path[row][col] = step;
            for(int [] a : path){
                System.out.println(Arrays.toString(a));
            }
            System.out.println(empty);
            System.out.println(step);
            return;
        }
        if(!res[row][col]){
            return;
        }

        res[row][col]  = false;

        path[row][col] = step;
        if(row < res.length-1){
            realBackTracking2(empty+"D", res,path,step+1,row +1, col);
        }

        if(col < res[row].length-1){
            realBackTracking2(empty+"R", res,path,step+1, row,col +1 );
        }

        if(row > 0){
            realBackTracking2(empty + "U",res,path,step+1,row -1, col);
        }

        if(col > 0){
            realBackTracking2(empty+ "L", res,path,step+1, row, col-1);
        }

        res[row][col] = true;

        path[row][col] = 0;


    }
}

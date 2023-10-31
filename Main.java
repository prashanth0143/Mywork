package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the no Lines");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        pascalTriangle(number);
        pascalTri(number);
        }

        //pascal triangle normal method ;
    public static void pascalTriangle(int n){

        for (int i = 1; i <= n; i++) {
            int num = 1;
            for (int  j = n; j > i ; j--) {
                //for spacing;
                System.out.print(" ");
            }
            for (int k = 1; k <=i; k++) {
                System.out.print(num + " ");
            }

            System.out.println("");
        }


    }

    //Referred google for this
    //pascal triangle first learned and implement myself;

   public static void pascalTri(int n){

        int space = n; //for space
        int number = 1; // for reinitilize again
       for (int i = 0; i < n ; i++) {
           //nested for spacing
           for (int j = 1; j <= space; j++) {
               System.out.print(" ");
           }
           number = 1;
           for (int k = 0; k <=i ; k++) {
               System.out.print(number + " ");
               //im not aware of that formula thats y checked on google anna
               number = number * (i-k) / (k+1);

           }
           System.out.println(" ");
           space--;
       }

    }
    //try with recursion
//    static void triange(int row, int col){
//
//        if(row == 0 ){
//            return;
//        }
//
//        if(col < row){
//            System.out.print("*");
//            triange(row,col+1);
//        }
//        else {
//            System.out.println();
//            triange(row-1,0);
//        }
//    }
    }

package org.example;

public class pattern {
    public static void main(String[] args) {
        //Q3: Print the solid rectangle pattern
        int row = 4;
        int column = 5;

        /* for(int i=1; i<=row; i++) {
            for(int j=1; j<=column; j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

        /*Q4: Print the pattern like this (Hallow Rectangle)
            * * * * *
            *       *
            *       *
            * * * * *
        */
        for (int i=1; i<=row; i++) {
            for(int j=1; j<=column; j++){
                if(i==1 || j==1 || i==row || j==column){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

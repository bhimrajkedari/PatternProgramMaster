
/*
 print following pattern 
  
*****
*   *
*   *
*   *
*****

 */
package com.rajkedari.pattern;

import java.util.Scanner;

public class Pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of pattern..");
        int size = sc.nextInt();
        for (int r = 1; r <= size; r++)  // this is for print first row
        {
            System.out.print("*");
        }
        System.out.println();
        for (int k = 2; k <= size - 1; k++) // this is for print from 2nd row to 4th row
        {
            for (int c = 1; c <= size; c++)// this is for printing printing first and last column *
            {
                if (c == 1 || c == size)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int r = 1; r <= size; r++) {
            System.out.print("*" + "");
        }

    }
}

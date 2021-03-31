/*this is with same approach like previous program but with nested for loops...
 print following pattern 
  
*****
*   *
*   *
*   *
*****
*/

package com.rajkedari.pattern;

import java.util.Scanner;

public class Pattern2 {
 
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of pattern");
		int size=sc.nextInt();
		for(int r=1;r<=size;r++)
		{
			for(int c=1;c<=size;c++)
			{
				
				if(r==1 || r==size || c==1 || c==size)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}

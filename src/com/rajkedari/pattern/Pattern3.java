/*
print following pattern...


*
**
***
****
*****
******
   
 */

package com.rajkedari.pattern;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size for pattern...");
		int size=sc.nextInt();
		
		for(int r=1;r<=size;r++)
		{
			for(int c=1;c<=size;c++)
			{	
				if(c<=r)
				System.out.print("*");
			}	
			System.out.println();
		}
		
	}
}

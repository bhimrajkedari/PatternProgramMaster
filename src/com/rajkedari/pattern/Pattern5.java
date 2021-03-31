package com.rajkedari.pattern;
public class Pattern5 {

	public static void main(String[] args) {
		int size=10;
		for(int i=1;i<=size;i++)
		{
				for(int j=10;j<=i;j--)
				{
					if(j>i)
					System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}		
		}
	}


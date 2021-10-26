//Updated by Darpan
//Kuebiko- updating to github - practice 
//Code referenced form geeksforgeeeks

import java.util.Scanner;

public class CountChar {
	static void countString(String a)
	{
		int c[]=new int[256];
		
		for(int i=0; i<a.length(); i++)
		{
			c[a.charAt(i)]++;
		}
		char x[] = new char[a.length()];
		for (int i =0; i<a.length(); i++)
		{
			x[i] = a.charAt(i);
			int isIn = 0;
			for(int j=0; j<=i; j++)
			{
				if(a.charAt(i) == x[j])
				{
					isIn++;
				}
			}
			if (isIn == 1)
			{
				System.out.println("There are "+c[a.charAt(i)]+" "+a.charAt(i)+"'s in "+a);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("A program to print the number of repetition of the given string!!\n");
		System.out.println("Enter a word to count number of Occurance of its letters!!");
		String s =in.next();
		countString(s);

	}

}

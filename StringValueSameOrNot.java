package test_27_03_25;

import java.util.Scanner;

public class StringValueSameOrNot 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First String");
		String st1 = s.next();
		System.out.println("Enter the Second String");
		String st2 = s.next();
		if(!(st1.equals(st2)))
		{
			String temp = st1;
			st1 = st2;
			st2 = temp;
		}
		System.out.println(st1);
		System.out.println(st2);
	}
}

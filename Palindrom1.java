package Logic_P;

import java.util.Scanner;

public class Palindrom1 
{
	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter a no.");
		int num=sc1.nextInt();
		
		int r,sum=0;
		int num1=num;
		
		while(num1!=0)
		{
			r=num1%10;
			sum=sum*10+r;
			num1=num1/10;
		}
		
		if(num==sum)
		{
			System.out.println(num+" is a palindrom!!");
		}
		else
		{
			System.out.println(num+" is not a palindrom!!");
		}
		sc1.close();
	}

}

package maven.demo;
import java.io.*;
import java.util.*;


public class demo extends Chocolates_and_sweets {
	public static void main(String s[])
	{
		Chocolates_and_sweets a= new Chocolates_and_sweets();
			Chocolates_and_sweets b= new Chocolates_and_sweets();
			Scanner ip= new Scanner(System.in);
			int n,count=0;
			int d[]=new int[100];
			System.out.println("Enter the total number of children");
			n=ip.nextInt();
			System.out.println("Enter the weight of childerns gifts");
			for (int i=0;i<n;i++)
			{
				d[i]=ip.nextInt();
			}
			for (int i=0;i<n;i++)
			{
				count=count+d[i];
			}
			System.out.println("Total weight of chocolates recived is :"+count);
		//	Collections.sort(d);
	}
			
	}
	
	

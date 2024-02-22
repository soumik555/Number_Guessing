package Guess;// Mini project on Number guessing


import java.util.Scanner;

public class Numberguess {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int myno=(int)(Math.random()*100);//(0-100)
		int userno=0;
		
		do
		{
			System.out.println(" Enter your number: ");
			 userno=sc.nextInt();
			if(myno==userno)
			{
				System.out.println("Number matching is done: Thank you ");
				break;
				
			}
			else if(userno>myno)
			{
				System.out.println(" Your number is too Large ");
				
			}
			else if(userno<myno)
			{
				System.out.println(" Your number is too small ");
				
			}
			
			
			
		}
		while(userno>=0);
		{
			System.out.println(" My number was : " + myno);
		}
		
		
		}
					
		
		
	}
	
	



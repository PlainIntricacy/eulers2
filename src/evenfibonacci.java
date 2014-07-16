
//ProjectEuler.net
//Problem 2
//Calculate the sum of all even terms of a Fibonacci series with X terms, as requested by the user
import java.util.Scanner;
public class evenfibonacci 
{
	public static void main(String[] args)
	{
		long userinput;
		long iteration1=0, iteration2=1, evensum=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the value limit of this Fibonacci series: ");
		userinput=input.nextLong();
		System.out.println("---------------------------------");
		System.out.println("Fibonacci series based on user input: ");
		while(iteration1<=userinput||iteration2<=userinput){		
			if(iteration1%2==0)
				evensum+=iteration1;
			if(iteration2%2==0)
				evensum+=iteration2;
			System.out.println(iteration1);
			System.out.println(iteration2);
			iteration1=iteration1+iteration2;
			iteration2=iteration2+iteration1;
		};
		if(evensum>0)
			System.out.println("Even terms found. Sum of all even terms found is " + evensum);
		else
			System.out.println("No even terms found.");
		
		input.close();
		
	}
		
}

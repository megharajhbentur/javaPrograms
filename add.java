package practice;
import java.util.Scanner;

public class add {
	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter an integer");
	int a=scan.nextInt();
	double b=scan.nextDouble();
	
	double sum=a+b;
	System.out.println("sum="+sum);
	
}

}

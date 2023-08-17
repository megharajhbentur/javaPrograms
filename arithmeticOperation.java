import java.util.Scanner;
public class arithmeticOperation {
	static void subtraction(int num1,int num2)
	{
		System.out.println("subtraction"+(num1-num2));
		
	}
	static void multiplication(int num1,int num2)
	{
		System.out.println("multiplication"+(num1*num2));
		
	}
	static double dividenumber()
	{Scanner scan=new Scanner(System.in);
	double a=scan.nextDouble();
	double b=scan.nextDouble();
	double result=a/b;
		return result;
		
	}static void remainder (int num1,int num2)
	{
		System.out.println("remainder"+(num1%num2));
		
	}
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		subtraction(num1,num2);
		multiplication(num1,num2);
		double result=dividenumber();
		System.out.println("result="+result);
		remainder(num1,num2);
		
		
		
	}

}

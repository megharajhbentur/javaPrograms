import java.util.Scanner;
class calculatorapp
{
public static void  main(String[] args)
{
	addition();
	Scanner scan=new Scanner(System.in);
	System.out.println("enter two numbers for subtraction");
	int a=scan.nextInt();
	int b=scan.nextInt();
	subtraction(a,b);
	int product=multiplication();
	System.out.println("product=" + product);
	System.out.println("enter two numbers for division ");
	int c=scan.nextInt();
	int d=scan.nextInt();
	double quotient=division(c,d);
	System.out.println("quotient=" + quotient);
	System.out.println(" enter two number for modulas");
	int e=scan.nextInt();
	int f=scan.nextInt();
	double reminder=modulas(e,f);
	System.out.println("reminder=" + reminder);
	
	
}
static void addition()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter two numbers addition ");
	int a=scan.nextInt();
	int b=scan.nextInt();
	System.out.println("Addition=" + (a+b));
}
static void subtraction(int a,int b)
{
System.out.println("Subtraction=" + (a-b));
}
static int multiplication()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter two numbers multiplication ");
	int a=scan.nextInt();
	int b=scan.nextInt();
	return a*b;
}
static double division(int c,int d)
{
return c/d;
}
static double modulas(int e,int f)
{
return e%f;
}
}
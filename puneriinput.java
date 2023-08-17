import java.util.Scanner;
class puneriinput
{
	public static void main(String[] args)
	{
		punerichai();
	}
	static void punerichai()
	{
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	System.out.println("bill of normal chai =" + a);
	int quantity=scan.nextInt();
	System.out.println("bill of number of chai =" + (quantity*a));
	String flavour=scan.next();
	int b=scan.nextInt();
	System.out.println("bill of flavour chai " + flavour + b);
	System.out.println("bill of number of flavour chai " + flavour + (quantity*b));
	}
}
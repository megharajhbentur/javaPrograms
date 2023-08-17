import java.util.Scanner;

public class postivenumber {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int a=scan.nextInt();
	int b=scan.nextInt();
	if(a>b)
	{
		System.out.println("postive a="+(a-b));}
		else {
			System.out.println("postive b="+(b-a));
	}scan.close();
	}}

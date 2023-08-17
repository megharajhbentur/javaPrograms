import java.util.Scanner;
public class postivereal {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number ");
	int a=scan.nextInt();
	if(a>=0)
	{
		System.out.println("it is postive number="+a);
	}else
		{
	System.out.println("it is negative number="+a);		
	}
	scan.close();
	}

}

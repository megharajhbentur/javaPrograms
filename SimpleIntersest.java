import java.util.Scanner;

public class SimpleIntersest {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the principal");
	int p=scanner.nextInt();
	System.out.println("enter the time");
	int t=scanner.nextInt();
	System.out.println("enter the rate");
	int r=scanner.nextInt();
	//double simpleinterest=(p*t*r)/100;
	System.out.println("simple interest="+simpleinterest(p,t,r));
	scanner.close();
	}

	 static double simpleinterest(int p, int t, int r) {
		
		return (p*t*r)/100;
	}

}

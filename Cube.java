import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {

Scanner scan=new Scanner(System.in);
System.out.println("enter the value");
int a=scan.nextInt();
int cube=cubenumber(a);
System.out.println("cube="+cube);
	}

	private static int cubenumber(int a) {
		return a*a*a;
	}

}

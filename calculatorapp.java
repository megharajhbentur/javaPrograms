package practice;
import java.util.Scanner;

public class calculatorapp {
	public static void main(String[] args) {
		
	
	
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int a=scan.nextInt();
		int b=scan.nextInt();
		calculator c=new calculator();
		c.add(a,b);
		c.sub(a,b);
		c.mult(a,b);
		c.diff(a,b);
		c.modul(a,b);
	}

}

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
Scanner Scanner=new Scanner(System.in);
System.out.println("enter the fahrenheit");
double f=Scanner.nextDouble();
double celsius=convert(f);
System.out.println("celsius="+celsius);
Scanner.close();
	}

	private static double convert(double f) {
	double celsius=((f-32)*5)/9;
		return celsius;
	}

}

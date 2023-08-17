import java.util.Scanner;

public class currency {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the currency");
		double rupee=scanner.nextDouble();
		double dollor=dollorcurrency(rupee);
		double pound=poundcurrency(rupee);
		System.out.println("dollor="+dollor);
		System.out.println("pound="+pound);
		
		scanner.close();
		

	}

	private static double poundcurrency(double rupee) {
		
		double pound=(rupee*0.0095);
		return pound;
	}

	private static double dollorcurrency(double rupee) {
		double dollor=(rupee*0.012);
	
		return dollor;
	}

}

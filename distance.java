import java.util.Scanner;

public class distance {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("enter the speed");
double speed=scanner.nextDouble();
System.out.println("enter the time");
double time=scanner.nextDouble();
double distance=Dist(speed,time);
System.out.println("distance="+distance);
scanner.close();


	}

	private static double Dist(double speed, double time) {
		
		return speed*time;
	}

}

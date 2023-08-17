import java.util.Scanner;

public class StudentPortal {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the 8 semster marks");
		System.out.println("enter the 1sem marks");
		int a=scanner.nextInt();
		System.out.println("enter the 2sem marks");
		int b=scanner.nextInt();
		System.out.println("enter the 3sem marks");
		int c=scanner.nextInt();
		System.out.println("enter the 4sem marks");
		int d=scanner.nextInt();
		System.out.println("enter the 5sem marks");
		int e=scanner.nextInt();
		System.out.println("enter the 6sem marks");
		int f=scanner.nextInt();
		System.out.println("enter the 7sem marks");
		int g=scanner.nextInt();
		System.out.println("enter the 8sem marks");
		int h=scanner.nextInt();
		double result=average(a,b,c,d,e,f,g,h);
		System.out.println("avrage result="+result);
		scanner.close();
		

	}

	private static double average(double a,double b,double c,double d,double e,double f,double g,double h) {
	double result=((a+b+c+d+e+f+g+h)/800)*100;
		return result;
	}

}

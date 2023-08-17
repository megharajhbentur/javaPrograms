import java.util.Scanner;

public class square {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the value");
	int a=scan.nextInt();
	int b=square(a);
	System.out.println(b);
	}
static int square(int a) {
	int b=a*a;
	return b;
}
}

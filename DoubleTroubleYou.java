import java.util.Scanner;

public class DoubleTroubleYou {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the number");
	int num=scanner.nextInt();
	int result=Doublethenumber(num);
	System.out.println("result="+result);
	scanner.close();
	}

	private static int Doublethenumber(int num) {
		
		return num*2;
	}

}

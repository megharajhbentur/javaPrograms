import java.util.Scanner;

public class SecretMessage {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the code");
		char c=scanner.next().charAt(0);
		 int charcter=decodecharacter(c);
		System.out.println("code="+charcter);
		

	}

	 static int decodecharacter(char c) {

		return c;	

	}

}

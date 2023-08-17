import java.util.Scanner;
public class color {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the alphabet");
		char c=scan.next().charAt(0);
		switch (c)
		{
		case 'v','V' :
			System.out.println("violet");
			break;
		case 'i','I' :
			System.out.println("indigo");
			break;
		case 'b','B' :
			System.out.println("blue");
			break;
		case 'g','G' :
			System.out.println("green");
			break;
		case 'y','Y' :
			System.out.println("yellow");
			break;
		case 'o','O' :
			System.out.println("orange");
			break;
		case 'r','R' :
			System.out.println("red");
			break;
			default :
				System.out.println("invalid");
		}
		
		


	}

}

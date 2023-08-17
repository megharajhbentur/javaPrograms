import java.util.Scanner;
public class socialnetworking {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the firstname ");
	String firstname=scan.next();
	System.out.println("enter the lastname");
	String lastname=scan.next();
	String fullname=stringjoiner(firstname,lastname);
	System.out.println("your full name="+fullname);
	}
	static String stringjoiner(String firstname,String lastname) {
		return firstname+""+lastname;
	}

}

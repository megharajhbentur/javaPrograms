
import java.util.Scanner;

public class student2 {
	int rollno;
	int age;
	String name;
	student2()
	{
		Scanner scan = new Scanner(System.in);
System.out.println("enter the rollno");
	int rollno=scan.nextInt();
System.out.println("enter the age");
	int age=scan.nextInt();
System.out.println("enter the name");
	String name=scan.next();
		this.rollno=rollno;
		this.age=age;
		this.name=name;
	}
	
	
	

}
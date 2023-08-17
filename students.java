package practice1;
import java.util.Scanner;

public class students {
	int rollno;
	int age;
	String name;
	students(int rollno,int age,String name)
{
		Scanner scan = new Scanner(System.in);
		int rollno=scan.nextInt();
		int age=scan.nextInt();
		String name=scan.next();
}
	private static void name(String[] args) {
		students s1=new students(rollno,age,name);
		System.out.println("rollno="+s1.rollno+"age="+s1.age+"name"+s1.name);
		
		
	}

}
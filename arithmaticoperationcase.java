import java.util.Scanner;
public class arithmaticoperationcase {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("choose the operation -,*,/,%");
char c=scan.next().charAt(0);
 System.out.println("enter the number");
int a=scan.nextInt();
int b=scan.nextInt();
switch(c)
{
case '-' :
System.out.println("subtraction="+(a-b));
break;
case '*' :
System.out.println("multiplication="+(a*b));
break;
case '/' :
System.out.println("division="+(a/b));
break;
case '%' :
System.out.println("modulas="+(a-b));
break;
default :
	System.out.println("invalid operation");
}
	}

}

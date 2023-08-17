import java.util.Scanner;
class userinput
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("enter a number=");
int a=scan.nextInt();
System.out.println("enter another number=");
int b=scan.nextInt();
int sum=a+b;
System.out.println("Sum=" + sum);
}
}



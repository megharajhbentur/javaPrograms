import java.util.Scanner;

public class VowelsandAlbhabets {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the character");
char c=scan.next().charAt(0);
if(c=='a' || c=='A') {
	System.out.println("vowel");
}else if(c=='e' || c=='E') {
	System.out.println("vowel");
}else if(c=='i' || c=='I') {
	System.out.println("vowel");
}else if(c=='o' || c=='O')
{
	System.out.println("VOWEL");
}else if(c=='u' ||c=='U') {
	System.out.println("vowel");
}else {
	System.out.println("constanient");
}
scan.close();

	}

}

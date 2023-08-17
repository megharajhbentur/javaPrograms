import java.util.Scanner;

public class DifferentField {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the marks");
		int marks=scanner.nextInt();
		scanner.close();
	if(marks>=90)
	{
		System.out.println("Master in AI");
	}else if(marks>=75 ){
		System.out.println("GO to IOT");
	}else if(marks>=60){
		System.out.println("Neural Network");
		}else if(marks>=45) {
			System.out.println("quantam computing");
		}else {
			System.out.println("IT job");
		}
	}

}

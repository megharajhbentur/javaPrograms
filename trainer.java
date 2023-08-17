package practice;

public class trainer {
	int id;
	String name;
	String subject; 
	trainer(int a, String b, String c)
	{
	id=a;
	name=b;
	subject=c;
	}
	trainer(int a, String b)
	{
		id=a;
		name=b;
	}
	

	void teach() {
		System.out.println("started teaching");
		
	}
	void attendance() {
		System.out.println("to take attendance on daily base ");
		
	}
	//void givedata(int a, String b, String c)
//{
//id=a;
//name=b;
//subject=c;
//}
}

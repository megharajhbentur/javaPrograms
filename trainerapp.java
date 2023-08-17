package practice;

public class trainerapp {
	public static void main(String[] args)
	{
	trainer	t1=new trainer(1234,"Arun","java");
	trainer t2=new trainer(345,"megharaj","java");
	//t1.id=1234;
	//t1.name="arun";
	//t1.subject="java";
	//t1.givedata(1234, "arun", "java");
	System.out.println("id=" + t1.id + "name=" + t1.name + "subject=" + t1.subject);
	t1.teach();
	t1.attendance();
	System.out.println("id=" + t2.id + "name=" + t2.name + "subject=" + t2.subject);
	t2.teach();
	t2.attendance();
	
	}
	

}

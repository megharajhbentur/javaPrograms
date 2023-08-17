class studentapp
{
public static void main(String[] args)
{
student s1=new student();
s1.id=28;
s1.name="megharaj";
s1.branch="cse";
System.out.println("id= " + s1.id);
System.out.println("name= " + s1.name);
System.out.println("branch= " + s1.branch);
s1.eat();
s1.sleep();
s1.study();
}
}
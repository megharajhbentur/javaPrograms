package entrepreneur;

public class Entrepreneurapp {

	public static void main(String[] args) {
	   Entrepreneur e1=new Entrepreneur(123, "megaraj", 500);
	   System.out.println("id="+e1.ownershipid+",name="+e1.organizationname+",size="+e1.size_of_organization);
	   Entrepreneur e2=new Entrepreneur(123, "megaraj", 500);
	   System.out.println("id="+e2.ownershipid+",name="+e2.organizationname+",size="+e2.size_of_organization);
	   Entrepreneur e3=new Entrepreneur(123, "megaraj");
	   System.out.println("id="+e3.ownershipid+",name="+e3.organizationname+",size="+e3.size_of_organization);
	   
	}

}

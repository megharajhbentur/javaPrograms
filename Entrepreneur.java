package entrepreneur;

public class Entrepreneur {
	int ownershipid;
	String organizationname;
	int size_of_organization;
	void acquire()
	{
		System.out.println("acquiring other org");
		
	}
	void raise_fund()
	{
		System.out.println("hurryyy fund raised");
	}
	 Entrepreneur(int ownershipid, String organizationname, int size_of_organization) {
		this.ownershipid = ownershipid;
		this.organizationname = organizationname;
		this.size_of_organization = size_of_organization;
	}
	 Entrepreneur(int ownershipid, String organizationname) {
			this.ownershipid = ownershipid;
			this.organizationname = organizationname;
			
		}
	

}

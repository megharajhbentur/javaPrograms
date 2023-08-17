class carapp
{
public static void main(String[] args)
{
car c1=new car();
System.out.println("***before***");
System.out.println("model= " + c1.model);
System.out.println("price= " + c1.price);
System.out.println("colour= " + c1.colour);
System.out.println("manfactuer= " + c1.manfactuer);
System.out.println("***after***");
c1.model=2020;
c1.price=500000;
c1.colour="black";
c1.manfactuer="swift";
System.out.println("model= " + c1.model);
System.out.println("price= " + c1.price);
System.out.println("colour= " + c1.colour);
System.out.println("manfact= " + c1.manfactuer);
}
}
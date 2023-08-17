class disneybakery
{
static void makechai()
{
System.out.println("bill for normal chai=10");
}
static void makechai(int quantity)
{
System.out.println("bill for normal chai =" + (quantity*10));
}
static void makechai(String flavour)
{
System.out.println("bill for " + flavour + "chai=15");
}
static void makechai(String flavour,int quantity)
{
System.out.println("bill for =" + flavour + (quantity*15));
}
public static void main(String[] args)
{
makechai();
makechai(2);
makechai("lemon");
makechai("ginger");
makechai("black");
makechai("tulsi");
makechai("choclate",5);
makechai("ginger",4);
makechai("black",2);
makechai("lemon",8);
makechai("tulsi",7);
}
}



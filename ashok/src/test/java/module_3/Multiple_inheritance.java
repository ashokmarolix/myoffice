package module_3;

class ICIC    //Ex
{
public void details()
{
System.out.println("John"+"Acc 23456"+"Branch Hyd");
}
}
class IOB
{
public void details()
{
System.out.println("John"+"Acc 34567"+"Branch Hyd");
}

class Cust extends ICIC,IOB(){
	
}
{ 
}
public class Details
{
    public static void main(String args[])
    {
Cust c1 = new Cust();
c1.details(); //JVM gets confused between details nethod in ICIC

    } 
    
}
















//public class Multiple_inheritance {

//	public static void main(String[] args) {
		 TODO Auto-generated method stub

	}

}

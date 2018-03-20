class A 
{
	public void m1() 
	{
		System.out.println("i am great tester");
		System.out.println("In M1"); //dummy comment 2
	}
	
}
class B extends A
{
	public void m2() 
	{
		System.out.println("In M2");
	}
}
class C extends B 
{
	public void m3() 
	{
		System.out.println("In M3");
	}
}
class Excecution
{
	public static void main(String[]args)
	{
		A rv1=(A) new B();
		rv1.m1();
		B rv2=(B)rv1;
		rv2.m1();
		rv2.m2();
		C rv3=(C)rv2;
		rv3.m1();
		rv3.m2();
		rv3.m3();
	}
}

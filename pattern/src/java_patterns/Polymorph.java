package java_patterns;
class A{
	public void f1(){
		System.out.println("inside f1 of A");
	}
	public void fA(){
		System.out.println("inside f1A of A");
	}
}
class B extends A{
	static int j;
	{
		System.out.println("instnce here");
	}
	static void  pr(){
		j=4;
		System.out.println(j);
		
	}
	public void f3(){
		System.out.println("inside f1 of B");
		pr();
	}
	public void f2(){
		System.out.println("inside f2 of B");
	}
	
}
class C extends B{
	public void fA(){
		System.out.println("inside fA of C");
	}
	public void fC(){
		System.out.println("inside of fc");
	}
	
}
public class Polymorph {
	public static void main(String[] args){
		A a1=new C();
		C c1=(C)a1;
		c1.fC();
		B b1=new B();
		b1.f3();
	}

}

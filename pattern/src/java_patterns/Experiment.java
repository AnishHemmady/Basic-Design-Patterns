package java_patterns;
class Demo{
	int x;
	
	public void functn1(){
		x+=1;
		System.out.println(x);
		String s6="hello";
		String s7="hello";
		String s1=new String("hello");
		String s2=new String("hello");
		StringBuilder s3=new StringBuilder("hello");
		StringBuilder s4=new StringBuilder("hello");
		s3.replace(3,3,"f");
		System.out.println(s3);
		if(s7==s6){
			System.out.println("true");
			
		}
		else{
			System.out.println("flase");
		}
	}
}
public class Experiment {
	public static void main(String[] args){
		Demo d=new Demo();
		d.functn1();
		d=new Demo();
		System.out.println(d.x);
	}
	
	
	

}

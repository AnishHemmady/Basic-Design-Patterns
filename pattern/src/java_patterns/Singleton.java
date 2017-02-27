package java_patterns;
class Singltn{
	private static Singltn st=new Singltn();
	private String name;
	private Singltn(){
		
	}
	public static Singltn getInstance(){
		return st;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
}
public class Singleton {
	
public static void main(String[] args){
	Singltn instnc=Singltn.getInstance();
	//instnc.setName("anish");
	String nme=instnc.getName();
	System.out.println(nme);
}
	
}

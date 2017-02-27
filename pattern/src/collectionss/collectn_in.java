package collectionss;


import java.util.*;

class Base{
	int data=1;
	public void running(int a){
		this.data+=a;
	}
	
	
}
public class collectn_in extends Base {
	
	int data;
	public void running(int b){
		this.data=b;
	}

	public static void main(String[] args){
		Base ptr=new Base();
		ptr.running(2);
		System.out.print(ptr.data);
		
		
		
		
	}
}

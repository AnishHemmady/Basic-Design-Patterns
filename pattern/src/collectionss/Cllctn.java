package collectionss;
import java.util.*;
public class Cllctn {
	int rollno;
	String name;
	Cllctn(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}

	public static void main(String[] args){
		ArrayList<String> st=new ArrayList<String>();
		ArrayList<Cllctn> s=new ArrayList<Cllctn>();
		st.add("hiten");
		st.add("rahul");
		st.add("anish");
		Cllctn c=new Cllctn(22,"anish");
		Cllctn c1=new Cllctn(22,"anish");
		s.add(c);
		s.add(c1);
		for(Cllctn cn:s){
			System.out.println(cn.rollno+" "+cn.name);
		}
		
		
		//Iterator it=st.iterator();
		/*while(it.hasNext()){
			System.out.println(it.next());
		}*/
		for(String a:st){
			System.out.println(a);
		}
		
		
	}
}

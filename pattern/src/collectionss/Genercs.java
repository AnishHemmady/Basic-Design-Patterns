package collectionss;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
abstract class Shape{
	abstract void draw();
}
class Rectangle extends Shape{
	public void draw(){
		System.out.println("Rectangle is drawn");
	}
}
class Circle extends Shape{
	public void draw(){
		System.out.println("Circle is drawn");
	}
}

class frst_chllnge{
	int n;
	int frst;
	int lst;
	frst_chllnge(int n,int frst,int lst){
		this.n=n;
		this.frst=frst;
		this.lst=lst;
		
	}
	void coding1(int N, int a, int b) {
		String print = "";
		for (int i = 1; i <= N; i++) {
			int temp = i;
			int match = i;
			while (temp > 0) {
				if (match == a || match == b) {
					print = "THINK";
				}
				match = temp % 10;
				temp = temp / 10;
			}
			if (i % a == 0 || i % b == 0) {
				if (print.equals("THINK")) {
					print = "OUTTHINK";
				} else {
					print = "OUT";
				}
			}
			if (print.equals("")) {
				print = "" + i;
			}
			if (i != N) {
				System.out.print(print + ",");
			} else {
				System.out.print(print);
			}
			print = "";
		}
	}
	void coding2(String string) {
		String[] arr = string.split("\\|");
		String result = "";
		int length = 0;
		for (int i = 0; i < arr.length; i++) {
			StringBuilder sb = new StringBuilder();
			int space = arr[i].trim().split(" ").length - 1;
			for (int j = 0; j < arr[i].length(); j++) {
				char ch = arr[i].charAt(j);
				int value = arr[i].charAt(j) - '0';
				if ((value >= 0 && value <= 9) || (value >= 17 && value <= 42)
						|| (value >= 49 && value <= 74))
					sb.append(ch);
			}
			if (length < sb.length() + space) {
				length = sb.length() + space;
				result = arr[i];
			}
		}
		System.out.println(result);
	}
	void mke_it(String s){
		String[] s7=s.split(" ");
		n=Integer.valueOf(s7[0]);
		frst=Integer.valueOf(s7[1]);
		lst=Integer.valueOf(s7[2]);
		
		String f1=Integer.toString(frst);
		String f2=Integer.toString(lst);
		String output="";
		for(int i=1;i<=n;i++){
			String inp=Integer.toString(i);
			if(inp.contains(f1)||inp.contains(f2)){
				output="THINK";
			}
			if(i%frst==0 || i%lst==0){
				if(output=="THINK"){
					output="OUTTHINK";
				}
				else{
					output="OUT";
				}
			}
			if(output==""){
				output=""+i;
			}
			if(i!=n){
				System.out.print(output+",");
			}else{
				System.out.print(output);
			}
			output="";
			
		}
		
	}
	public void see(int frst,int lst,int n){
		
	String f1=Integer.toString(frst);
	String f2=Integer.toString(lst);
	
	int flag=0;
	
	for(int i=1;i<=this.n;i++){
		String inp=Integer.toString(i);
		if(i%frst==0 || i%lst==0){
			flag=1;
			if(flag==1 && (inp.contains(f1)||inp.contains(f2)) ){
				flag=3;}
		}
		
		else if(inp.contains(f1)||inp.contains(f2)){
			flag=2;
		}
		
		
		if(flag==1){
			System.out.print("OUT");
			if(i!=this.n)
			System.out.print(",");
			
		}
		if(flag==2){
			System.out.print("THINK");
			if(i!=this.n)
			System.out.print(",");
		}
		if(flag==0){
			System.out.print(i);
			if(i!=this.n)
			System.out.print(",");
		}
		if(flag==3){
			System.out.print("OUTTHINK");
			if(i!=this.n)
			System.out.print(",");
		}
		flag=0;
		
	}
}
}




public class Genercs {

	public static void drawshapes(List<?extends Shape>lsts){
		for(Shape s:lsts){
			s.draw();
		}
	}


	public static void main(String[] args)throws IOException{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		    String s1;
		    List<String> s3=new ArrayList<>();
		    String[] s7 = null;
		    frst_chllnge chg=new frst_chllnge(20,3,4);
		    while ((s1 = in.readLine()) != null) {
		    	chg.mke_it(s1);
		    }
		 System.out.print(s1);
		
		chg.coding1(20, 3, 4);
		System.out.println("");
		//chg.mke_it(3, 4, 20);
		chg.coding2("IBM Cognitive Computing|IBM 'Cognitive' Computing is revolutionary"
				+ "|ibm cognitive   computing|IBM cognitive computing is revolutionary?");
		
	}
}


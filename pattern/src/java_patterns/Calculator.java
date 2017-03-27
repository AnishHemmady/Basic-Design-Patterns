package java_patterns;

class Stack{
	int size;
	int top;
	int[] stack;
	Stack(int size){
		this.size=size;
		top=-1;
		stack=new int[size];
	}
	public void push(int ele){
		top+=1;
		if (top<size){
			stack[top]=ele;
		}
		else{
			System.out.println("Stack is full");
		}
		
	}
	public int pop(){
		if(top!=-1){
			int tp=stack[top];
			top-=1;
			return tp;
		}
		else{
			return -1;
		}
	}
	
}

public class Calculator {

}

package collectionss;

import java.util.Stack;
import java.util.*;

public class Twostckqueue<E> {
		public Stack<E> inp=new Stack<E>();
		public Stack<E> out=new Stack<E>();
		
		public void enqueue(E item){
			inp.push(item);
		}
		
		public E dequeue(){
			if(out.isEmpty()){
				while(!inp.isEmpty()){
					out.push(inp.pop());
				}
			}
			return out.pop();
		}
		
	public static void main(String[] args){
		Twostckqueue<Integer> tw=new Twostckqueue<Integer>();
		tw.enqueue(1);
		tw.enqueue(2);
		tw.enqueue(4);
		int val=tw.dequeue();
		System.out.print(val);
	}
	

}

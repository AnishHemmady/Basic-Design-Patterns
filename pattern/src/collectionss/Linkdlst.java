package collectionss;

public class Linkdlst<E> {
	
	Node head;
	class Node{
		E data;
		Node next;
		Node(E data){
			this.data=data;
		}
		
	}
	public void addn(E data){
		Node nde;
		if(head==null){
			nde=new Node(data);
			head=nde;
			
		}
		else{
			Node curr=head;
			while(curr.next!=null){
				curr=curr.next;
			}
			curr.next=new Node(data);
		}
	}
	
	public Node find_mid(){
		Node slowptr;
		Node fastptr;
		slowptr=head;
		fastptr=head;
		
		
		while((fastptr!=null)&&(fastptr.next!=null)){
			fastptr=fastptr.next.next;
			slowptr=slowptr.next;
			
		}
		
		return slowptr;
	}
	public void reverseit(){
		Node res;
		
	}
	
	public static void main(String[] args){
		Linkdlst<String> lk=new Linkdlst<String>();
		lk.addn("m");
		lk.addn("a");
		lk.addn("m");
		
		
		//System.out.println(lk.head.next.data);
	}

}

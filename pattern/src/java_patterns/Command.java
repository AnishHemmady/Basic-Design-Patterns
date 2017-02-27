package java_patterns;
import java.util.*;
class Stock{
	private String name="Telly Corp";
	private int quantity=10;
	public void buy(){
		System.out.println("Stock of "+name+" bought at quantity of "+quantity);
	}
	public void sell(){
		System.out.println("Stock of "+name+" sold at quantity of "+quantity);
	}
}
interface Order{
	public void excecute();
	
}
class BuyStock implements Order{
	private Stock newstck;
	 BuyStock(Stock newstk){
		this.newstck=newstk;
	}
	@Override
	public void excecute() {
		// TODO Auto-generated method stub
		newstck.buy();
	}
	
}
class SellStck implements Order{
	private Stock newstck;
	SellStck(Stock newstk){
		this.newstck=newstk;
	}
	@Override
	public void excecute() {
		// TODO Auto-generated method stub
		newstck.sell();
	}
	
}
class Broker{
	
	private List<Order>lst=new ArrayList<>();
	
	public void takeOrder(Order ord){
		lst.add(ord);
	}
	public void placeorder(){
		for(Order ordr:lst){
			ordr.excecute();
		}
		lst.clear();
	}
	
}
public class Command {
	public static void main(String[] args){
		Stock stcky=new Stock();
		BuyStock buystk=new BuyStock(stcky);
		SellStck sellstck=new SellStck(stcky);
		Broker brkr=new Broker();
		brkr.takeOrder(buystk);
		brkr.takeOrder(sellstck);
		brkr.placeorder();
	}

}

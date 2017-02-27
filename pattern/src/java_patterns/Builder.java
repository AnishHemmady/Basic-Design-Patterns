package java_patterns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface Item{
	public String name();
	public Packaging packaging();
	public float price();
}
interface Packaging{
	public String pack();
}
class Wrapper implements Packaging{
	public String pack(){
		return "Wrapper";
	}
}
class Bottle implements Packaging{
	public String pack(){
		return "Bottle";
	}
}
abstract class Burger implements Item{
	public Packaging packaging(){
		return new Wrapper();
	}
	public abstract float price();
}
abstract class ColdDrink implements Item{
	public Packaging packaging(){
		return new Bottle();
	}
	public abstract float price();
}
class ChickenBurger extends Burger{
	public float price(){
		return 31.5f;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Chicken Burger";
	}
}
class VegBurger extends Burger{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Aloo tikki burger";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 21.5f;
	}
	
}
class Pepsi extends ColdDrink{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "pepsi";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 12.5f;
	}
	
}
class Sprite extends ColdDrink{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Sprite";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 12.5f;
	}
	
}
class Meal {
	private List<Item> items=new ArrayList<>();
	public void addItem(Item itm){
		items.add(itm);
	}
	public float getCost(){
		float cost=0.0f;
		for(Item itm:items){
			cost+=itm.price();
		}
		return cost;
	}
	public void ShowItems(){
		for(Item itm:items){
			System.out.println(itm.name()+" "+itm.packaging().pack()+" "+itm.price());
		}
	}
}
public class Builder {

}

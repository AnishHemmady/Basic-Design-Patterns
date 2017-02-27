package exceptions;

interface Shape{
	 public void draw();
	
}
class Circle extends RuntimeException implements Shape{
	public void draw(){
		
	}
	
}
class Square extends RuntimeException implements Shape{
	public void draw(){
		
	}
}
class Triangle extends Square{
	
	public void say(){
		System.out.println("hello");
	}
}
class Rectangle extends Triangle{
	public void say(){
		System.out.println("hello");
	}
}


public class Exceptio {
	
	public static void main(String[] args){
		try{
			throw new Triangle();
		}
		catch(Rectangle e){
			System.out.println("Triangle is caught");
		}
		
		catch(Exception e){
			System.out.println("exception caught");
		}
	}
	

}

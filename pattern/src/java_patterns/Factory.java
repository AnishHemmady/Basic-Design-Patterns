package java_patterns;
 interface Shape{
	public void draw();
	
}

class Circle implements Shape{
	public void draw(){
		System.out.println("Circle is drawn");
	}
}
class Square implements Shape{
	public void draw(){
		System.out.println("Square is drawn");
	}
}
class Shapefctry{
	public Shape getShape(String shape){
		if (shape==null){
			return null;
		}
		else if (shape.equalsIgnoreCase("Circle")){
			return new Circle();
		}
		else if(shape.equalsIgnoreCase("Square")){
			return new Square();
		}
		return null;
	}
}
public class Factory {
	public static void main(String[] args){
		Shapefctry fctry=new Shapefctry();
		Shape shape1=fctry.getShape("CIRCLE");
		shape1.draw();
		Shape shape2=fctry.getShape("SqUare");
		shape2.draw();
		
	}
	
	
	

}

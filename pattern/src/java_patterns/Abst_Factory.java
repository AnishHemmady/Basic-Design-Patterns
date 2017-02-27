package java_patterns;
import java.util.*;

interface Shape1{
	public void draw();
}
interface Color{
	public void fill();
}
class Square1 implements Shape1{
	public void draw(){
		System.out.println("Square is drawn");
	}
}
class Circle1 implements Shape1{
	public void draw(){
		System.out.println("Circle is drawn");
	}
}
class Red implements Color{
	public void fill(){
		System.out.println("Red is filled");
	}
}
class Purple implements Color{
	public void fill(){
		System.out.println("Purple is filled");
	}
}
abstract class AbstractFactory{
	abstract Shape1 getShape(String shpe);
	abstract Color getColor(String color);
}
class ShapeFactory extends AbstractFactory {
	public Shape1 getShape(String shpe){
		if (shpe==null){
			return null;
		}
		else if (shpe.equalsIgnoreCase("Circle")){
			return new Circle1();
		}
		else if (shpe.equalsIgnoreCase("Square")){
			return new Square1();
		}
		return null;
		
		
	}

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
class ColorFactory extends AbstractFactory{
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		if (color==null){
			return null;
		}
		else if (color.equalsIgnoreCase("Red")){
			return new Red();
		}
		else if (color.equalsIgnoreCase("Purple")){
			return new Purple();
		}
		return null;
		
		
	
		
	
}

	@Override
	Shape1 getShape(String shpe) {
		// TODO Auto-generated method stub
		return null;
	}
}
class Factory_oo {
	public AbstractFactory getFactry(String input){
		if(input.equalsIgnoreCase("shape")){
			return new ShapeFactory();
		}
		else if(input.equalsIgnoreCase("color")){
			return new ColorFactory();
		}
		return null;
	}
}
public class Abst_Factory {
	public static void main (String[] args){
		Factory_oo fctry=new Factory_oo();
		AbstractFactory f=fctry.getFactry("SHAPE");
		Shape1 shpe=f.getShape("circle");
		shpe.draw();
		AbstractFactory f1=fctry.getFactry("color");
		Color clr=f1.getColor("red");
		clr.fill();
	}
	
}

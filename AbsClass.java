
public class AbsClass {
	public static void main(String args[])
	{
		Trapezoid a = new Trapezoid();
		Triangle b = new Triangle();
		Hexagon c = new Hexagon();
		
		//Printing the number of sides of each shape...
		System.out.println(a.numberOfSides());
		System.out.println(b.numberOfSides());
		System.out.println(c.numberOfSides());
	}
}

abstract class Shape {
	abstract public int numberOfSides();
}

class Trapezoid extends Shape {
	public int numberOfSides()
	{
		return 4;
	}
}

class Triangle extends Shape {
	public int numberOfSides()
	{
		return 3;
	}
}

class Hexagon extends Shape {
	public int numberOfSides()
	{
		return 6;
	}
}
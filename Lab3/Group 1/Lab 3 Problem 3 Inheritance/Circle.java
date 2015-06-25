
public class Circle {

	public double radius = 1.0;
	public String color = "Red";
	
	public Circle()
	{
		
	}
	
	public  Circle(double radius)
	{
		this.radius=radius;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double getArea()
	{
		return Math.PI*(radius*radius);
	}
	
	public String toString()
	{
		return("The Color Of The Circle Is "+color+"The Radius Of The Circle Is "+radius+"The Area Of The Circle Is "+getArea());
	}
}

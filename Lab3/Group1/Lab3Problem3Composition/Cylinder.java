
public class Cylinder {
	
	public double height = 1.0;
	public double radius;
	
	private Circle C = new Circle(radius);
	public Cylinder()
	{
		
	}
	
	public Cylinder(double radius)
	{
		this.radius=radius;
	}
	public Cylinder(double radius,double height)
	{
		this.radius=radius;
		this.height=height;
	}
	public double getHeight()
	{
		return height;
	}
	public double getVolume()
	{
		return(C.getArea()*height);
	}

}

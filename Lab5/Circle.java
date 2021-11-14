public class Circle extends Point 
{
	private double radius;
	
	public Circle(int x, int y, int radiusin)
	{
		super(x, y);
		setRadius(radiusin);
	}
	
	public void setRadius(int radiusin)
	{
		radius = radiusin;
	}
	
    public double getRadius()
	{
		return radius;
	}

	public String toString()
	{
		return "x: " + getX() + ", y: " + getY() + ", radius: " + getRadius();
	}
}
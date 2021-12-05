public class Sphere extends ThreeDShape{

    private double radius;
    private double height;

    public Sphere(String name, String colour,double radius)
    {
        super(name, colour);
        this.radius = radius;
    }

    public double area(){
        return 3.14 * radius * radius ;
    }

    public double volume(){
        return (4/3) * 3.14 * (radius * radius * radius) ;
    }
}
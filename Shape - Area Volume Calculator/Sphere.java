import java.lang.Math.*;
public class Sphere extends Shape implements Spatial
{
    private double radius;
    
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double area(){
        return (4*Math.PI*this.radius*this.radius);
    }
    public double volume(){
        return ((4*Math.PI*this.radius*this.radius*this.radius)/3);
    }
}
public class Rectangle extends Shape
{
    private double length,width;
    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }
    public void setLength(double length){
        this.length=length;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double area(){
        return this.length*this.width;
    }
    public double volume(){
        return -1;
    }
}
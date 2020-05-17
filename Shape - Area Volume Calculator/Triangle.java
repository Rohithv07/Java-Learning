public class Triangle extends Shape
{
    private double base,height;
    public double getBase(){
        return this.base;
    }
    public double getHeight(){
        return this.height;
    }
    public void setBase(double base){
        this.base=base;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double area(){
        return 0.5*this.base*this.height;
    }
    public double volume(){
        return -1;
    }
}
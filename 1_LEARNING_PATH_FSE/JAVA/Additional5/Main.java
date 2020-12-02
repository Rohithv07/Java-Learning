import java.util.*;
public class Main {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Shape [] shape = new Shape[5];
        
        String type;
        for(int i=0;i<5;i++){
            type=sc.next();
            switch(type){
                case "Triangle":
                    Triangle triangle=new Triangle();
                    triangle.setBase(sc.nextDouble());
                    triangle.setHeight(sc.nextDouble());
                    shape[i]=triangle;
                    break;
                case "Sphere":
                    Sphere sphere=new Sphere();
                    sphere.setRadius(sc.nextDouble());
                    shape[i]=sphere;
                    break;
                case "Rectangle":
                    Rectangle rectangle=new Rectangle();
                    rectangle.setLength(sc.nextDouble());
                    rectangle.setWidth(sc.nextDouble());
                    shape[i]=rectangle;
                    break;
                case "Cube":
                    Cube cube=new Cube();
                    cube.setLength(sc.nextDouble());
                    cube.setHeight(sc.nextDouble());
                    cube.setWidth(sc.nextDouble());
                    shape[i]=cube;
                    break;
            }
        }
        
        for (int i=0; i<5; i++) {
            System.out.println("Area " + shape[i].area());
            if (shape[i].volume() != -1) 
                System.out.println("Volume " + shape[i].volume());
        }
    }
}

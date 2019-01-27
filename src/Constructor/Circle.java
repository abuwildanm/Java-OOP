package Constructor;

public class Circle {
    private double radius;
    
    public Circle() { 
        new Circle(50.0);
        
//        radius = 7; /* ==> bakalan dianggap radius default */
    }
    
    public Circle(double r) {
        radius = r;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double r) {
        radius = r;
    }
}

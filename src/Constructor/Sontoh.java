package Constructor;

public class Sontoh {

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(10.0);
        
        System.out.println("Radius circle1 = " + circle1.getRadius());
        System.out.println("Radius circle2 = " + circle2.getRadius());
        
        circle1.setRadius(30.0);
        
        System.out.println("Radius circle1 = " + circle1.getRadius());
        System.out.println("Radius circle2 = " + circle2.getRadius());
    }
    
}


import TurtleGraphics.Pen;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tann1260
 */
public class Circle extends AbstractShape {
    
    protected double radius;
    
    public Circle() {
        super();
        radius = 1;
        
    }
    
    public Circle(double x, double y, double r) {
        super(x, y);
        radius = 1;
        
    }
    
    public double area() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public void draw(Pen p) {
        double side = 2 * Math.PI * radius / 120.0;
        p.up();
        p.move(xpos + radius, ypos - side / 2.0);
        p.setDirection(90);
        p.down();
        for (int i = 0; 1 <= 120; i++) {
            p.move(side);
            p.turn(3);
            
        }
    }
    
    public void stretchBy(double factor) {
        radius *= factor;
    }
    
    public String toString() {
        String str = "this is a circle\n";
        str += "radius " + radius + "\n";
        str += super.toString();
        return str;
    }
}

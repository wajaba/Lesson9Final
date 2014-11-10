
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
public class Circle implements Shape {

    private double radius, xPos, yPos;

    public Circle() {
        xPos = 0;
        yPos = 0;
        radius = 1;

    }

    public Circle(double x, double y, double r) {
        xPos = x;
        yPos = y;
        radius = 1;

    }

    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw(Pen p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getXpos() {
        return xPos;
    }

    public double getYpos() {
        return yPos;
    }

    public void move(double xLoc, double yLoc) {
        xPos = xLoc;
        yPos = yLoc;

    }

    public void stretchBy(double factor) {
        radius *= factor;
    }

    public String toString() {
        String str = "this is a circle\n";
        str+="XLoc "+xPos +"\t Yloc "+yPos + "\n";
        str += "radius " + radius + "\n";
        str +="area " + area();
        return str;
    }
}

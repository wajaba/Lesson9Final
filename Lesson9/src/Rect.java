
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
public class Rect implements Shape {

    private double width, height, xPos, yPos;

    public Rect() {
        xPos = 0;
        yPos = 0;
        width = 1;
        height = 1;

    }

    public Rect(double w, double h, double y, double x) {
        xPos = x;
        yPos = y;
        width = w;
        height = h;
    }

    public double area() {
        return width * height;
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(xPos,yPos);
        p.down();
        p.setDirection(0);
        p.move(width);
        p.turn(90);
        p.move(height);
        p.turn(90);
        p.move(width);
        p.turn(90);
        p.move(height);
        p.turn(90);
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
        height *= factor;
        width *= factor;
    }

    public String toString() {
        String str = "this is a rectangle\n";
        str += "XLoc " + xPos + "\t Yloc " + yPos + "\n";
        str += "width " + width + "\t height" + height + "\n";
        str += "area " + area();
        return str;
    }
}

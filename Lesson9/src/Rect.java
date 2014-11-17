
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
public class Rect extends AbstractShape {

    private double width, height;

    public Rect() {
        super();
        width = 1;
        height = 1;

    }

    public Rect(double w, double h, double y, double x) {
        super(x, y);
        width = w;
        height = h;
    }

    public double area() {
        return width * height;
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(xpos, ypos);
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

    public void stretchBy(double factor) {
        height *= factor;
        width *= factor;
    }

    public String toString() {
        String str = "this is a rectangle\n";
        str += "width " + width + "\t height" + height + "\n";
        str += "\n" + super.toString();
        return str;
    }
}

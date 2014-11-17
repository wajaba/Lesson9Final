
import TurtleGraphics.*;

abstract public class AbstractShape implements Shape {

    protected double xpos, ypos;

    public String toString() {
        String str = "X-Y position" + xpos + "," + ypos;
        str+= "\nArea= " + area();
        return str;
    }

    public AbstractShape() {
        xpos = 0;
        ypos = 0;
    }

    public AbstractShape(double x, double y) {
        xpos = 0;
        ypos = 0;
    }

    public double getXpos() {
        return xpos;
    }

    public double getYpos() {
        return ypos;
    }

    public void move(double xLoc, double yLoc) {
        xpos = xLoc;
        ypos = yLoc;

    }
}

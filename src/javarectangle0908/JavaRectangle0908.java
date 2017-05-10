/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javarectangle0908;

/**
 *
 * @author kms080
 */
import gpdraw.*;
import javax.swing.JOptionPane;

public class JavaRectangle0908 {    
    public static void main(String[] args) {
       //rectangle rectA = new rectangle();
       //rectangle rectB = new rectangle(0, -80, 400, 160);
       rectangle rectC = new rectangle(100, -100, 20, 300);
    }
}

class rectangle {
    private double myX;
    private double myY;
    private double myWidth;
    private double myHeight;
    private DrawingTool pen;
    private SketchPad paper;
    rectangle() {
        myX = 0;
        myWidth = 0;
        myY = 0;
        myHeight = 0;
        this.draw();
    }
    rectangle(double x, double y, double width, double height) {
        myX = x;
        myWidth = width;
        myY = y;
        myHeight = height;
        this.draw();
    }
    public double getPerimeter(){
        double perimeter = 2 * (myHeight + myWidth);
        return perimeter;
    }
    public double getArea(){
        double area = myWidth * myHeight;
        return area;
    }
    public void draw(){
        paper = new SketchPad(500,500);
        pen = new DrawingTool(paper);
        pen.setDirection(90);
        pen.forward(myHeight);
        pen.turnRight();
        pen.forward(myWidth);
        pen.turnRight();
        pen.forward(myHeight);
        pen.turnRight();
        pen.forward(myWidth);
    }
}

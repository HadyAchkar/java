package javaapplication5;

public class Rectangle extends Quadrilateral {
    private int width,height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public double getArea(){
        return width*height;
    }
    
    public double getPerimeter(){
        return 2*(width+height);
    }
    
}

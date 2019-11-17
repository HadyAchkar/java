package javaapplication5;

public abstract class Shape {
    private int numSides;
    private static int numShapes;

    public Shape(int numSides) {
        this.numSides = numSides;
        numShapes++;
    }

    public int getNumSides() {
        return numSides;
    }

    public static int getNumShapes() {
        return numShapes;
    }
    
    public boolean equals (Object obj){
        if(this==obj) return true;
        if(!(obj instanceof Shape)) return false;
        Shape s = (Shape) obj;
        return numSides==s.numSides;
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();
}

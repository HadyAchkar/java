package javaapplication5;

public class JavaApplication5 {

    public static void main(String[] args) {
        Shape s1 = new Rectangle (5,3);
        Shape s2 = new Rectangle (8,5);
        
        if(s1.equals(s2)){
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        
        System.out.println("Num of Shape objects = "+Shape.getNumShapes());
    }
    
}

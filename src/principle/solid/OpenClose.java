/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principle.solid;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thetkhine
 */
abstract class Shape
{
    abstract long area();
    
}
class Circle extends Shape
{

    @Override
    long area() {
        return 1;
    }
}
class Rectangle extends Shape
{

    @Override
    long area() {
        return 2;
    }
    
}
class Triangle extends Shape
{

    @Override
    long area() {
        return 3;
    }
    
}
public class OpenClose {
    static long sumAllArea(List<Shape> shapes)
    {
        long sum = 0;
        for(Shape shape : shapes)
        {
            sum+= shape.area();
        }
        return sum;
    }
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle());
        shapes.add(new Rectangle());
        shapes.add(new Triangle());
        
        long sum = sumAllArea(shapes);
        System.out.println("Sum "+sum);
    }
}

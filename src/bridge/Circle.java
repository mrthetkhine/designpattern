/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author Mr T.Khine
 */
public class Circle extends Shape{

    public Circle(DrawingAPI api) {
        super(api);
    }

    @Override
    void draw() {
        api.drawCircle();
    }
    
}

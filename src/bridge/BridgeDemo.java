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
public class BridgeDemo {
    public static void main(String[] args) {
        DrawingAPI api = new SVGApi();
        
        Shape s = new Rectangle(api);
        s.draw();
        
        api = new CanvasAPI();
        s = new Circle(api);
        s.draw();
    }
}

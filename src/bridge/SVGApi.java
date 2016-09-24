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
public class SVGApi implements DrawingAPI{

    @Override
    public void drawCircle() {
        System.out.println("Draw SVG Circle");
    }

    @Override
    public void drawRectangle() {
        System.out.println("Draw SVG Rectangle");
    }
    
}

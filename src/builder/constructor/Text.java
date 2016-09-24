/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.constructor;

import builder.*;

/**
 *
 * @author Mr T.Khine
 */
public class Text {
    String displayValue;
    String font;
    String color;
    String decoration;

    Text(String displayValue) {
        this.displayValue = displayValue;
            
    }
    public Text(String displayValue,String font)
    {
        this.displayValue = displayValue;
        this.font= font;
    }
 
    public Text(String displayValue,String font,String color)
    {
        this.displayValue = displayValue;
        this.font = font;
        this.color = color;
    }
       
    
}

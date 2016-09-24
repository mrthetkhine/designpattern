/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author Mr T.Khine
 */
public class View extends UIWidget{

    public View(String id)
    {
        super(id);
    }
    
    @Override
    void paint() {
        System.out.println("Paint "+this.id);
    }
    
}

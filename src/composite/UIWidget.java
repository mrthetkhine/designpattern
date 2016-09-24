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
public abstract class UIWidget {
    String id;

    public UIWidget(String id) {
        this.id = id;
    }
  
    abstract void paint();
}

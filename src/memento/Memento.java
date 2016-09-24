/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author Mr T.Khine
 */
public class Memento {
    String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getSavedState() {
        return this.state;
    }
    
    
}

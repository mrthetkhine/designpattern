/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mr T.Khine
 */
public class CareTaker {
    public static void main(String[] args) {
        List<Memento> savedState = new ArrayList<Memento>();
        Originator originator = new Originator();
        
        originator.setState("State1");
        originator.setState("State2");
        originator.setState("State3");
        
        savedState.add( originator.saveToMemento());
        
        originator.setState("State4");
        originator.restoreFromMemento(savedState.get(0));
        System.out.println("Oringinal State "+ originator.state);
    }
    
}

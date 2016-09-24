/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author Mr T.Khine
 */
public class HungryState implements State{

    @Override
    public void doAction(StateContext context) {
        System.out.println("I am hungry");
        context.changeState(new EatingState());
    }
    
}

class EatingState implements State{

    @Override
    public void doAction(StateContext context) {
        System.out.println("I am Eating");
        context.changeState(new FullState());
    }
    
}
class FullState implements State{

    @Override
    public void doAction(StateContext context) {
        System.out.println("I am Full");
    }
    
}

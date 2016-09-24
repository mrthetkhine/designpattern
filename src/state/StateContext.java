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
public class StateContext {
    State currentState;
    
    public StateContext(State initial)
    {
        this.currentState = initial;
    }
    public void changeState(State newState)
    {
        this.currentState = newState;
    }
    public void doAction()
    {
        this.currentState.doAction(this);
    }
}

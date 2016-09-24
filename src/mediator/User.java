/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author Mr T.Khine
 */
public abstract class User {
    String userName;
    ChatMediator mediator;
    
    public User(ChatMediator mediator,String userName) {
        this.mediator = mediator;
        this.userName = userName;
    }
    
    abstract void sendMessage(String message);
    abstract void receive(String message);
    
}

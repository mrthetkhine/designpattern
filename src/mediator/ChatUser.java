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
public class ChatUser extends User {

    public ChatUser(ChatMediator mediator, String userName) {
        super(mediator, userName);
        mediator.addUser(this);
    }

    @Override
    void sendMessage(String message) {
        System.out.println("User "+this.userName+" send message to mediator "+ message);
        mediator.sendMessage(this, message);
    }

    @Override
    void receive(String message) {
        System.out.println("User "+this.userName+" receive message "+message);
        
    }
    
}

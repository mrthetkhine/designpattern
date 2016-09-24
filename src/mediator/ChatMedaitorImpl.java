/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mr T.Khine
 */
public class ChatMedaitorImpl implements ChatMediator{
    List<User> users = new ArrayList<User>();
    
    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(User user, String message) {
        //System.out.println("In Mediator broadcast");
        for (User u : this.users) {
            //System.out.println("User "+ u);
            if(u != user)
            {
                u.receive(message);
            }
        }
    }
    
}

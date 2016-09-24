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
public interface ChatClient {
    
    public void receiveMessage(String message);
    public void sendMessage(String message);
}

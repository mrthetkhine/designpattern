/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Mr T.Khine
 */
public interface Publisher {
    public void attach(Subscriber subscriber);
    
    public void change(String message);
}

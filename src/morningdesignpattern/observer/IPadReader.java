/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morningdesignpattern.observer;

/**
 *
 * @author Mr T.Khine
 */
public class IPadReader implements Subscriber{

    String name;

    public IPadReader(String name) {
        this.name = name;
    }
    
    @Override
    public void update(String title) {
        System.out.println(this.name+" Received from IPad update received "+title);
    }
    
}

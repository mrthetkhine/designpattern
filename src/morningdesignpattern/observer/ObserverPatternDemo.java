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
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Publisher agency = new NewsAgency();
        
        Subscriber r1 = new NewsReader("User1");
        Subscriber r2 = new IPadReader("User2");
        Subscriber r3 = new NewsReader("User3");
        
        agency.subscribe(r1);
        agency.subscribe(r2);
        agency.subscribe(r3);
        
        agency.publish("New1");
        
        agency.unsubscribe(r3);
        System.out.println("After");
        
        agency.publish("News2");
        
    }
}

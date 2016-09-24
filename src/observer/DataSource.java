/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import java.util.List;


public class DataSource implements Publisher {

    List<Subscriber> subscriberList = new ArrayList<Subscriber>();
    
    @Override
    public void attach(Subscriber subscriber) {
        
        subscriberList.add(subscriber);
    }

    @Override
    public void change(String message) {
        System.out.println("Publisher Change "+message);
        for(Subscriber sub : subscriberList)
        {
            sub.update(message);
        }
    }
    
}

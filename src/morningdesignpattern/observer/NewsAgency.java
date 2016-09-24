/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morningdesignpattern.observer;

import java.util.ArrayList;



/**
 *
 * @author Mr T.Khine
 */
public class NewsAgency implements Publisher{

    ArrayList<Subscriber> subscriberList = new ArrayList<>();
    
    @Override
    public void subscribe(Subscriber obj) {
        subscriberList.add(obj);
    }

    @Override
    public void unsubscribe(Subscriber obj) {
        subscriberList.remove(obj);
    }

    @Override
    public void publish(String title) {
        for (Subscriber sc : subscriberList) {
            sc.update(title);
        }
    }
    
}

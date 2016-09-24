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
public interface Publisher {
    public void subscribe(Subscriber obj);
    public void unsubscribe(Subscriber obj);
    
    public void publish(String title);
            
}

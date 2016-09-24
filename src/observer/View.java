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
public class View implements Subscriber{

    String viewName;

    public View(String viewName) {
        this.viewName = viewName;
    }
    
    
    @Override
    public void update(String message) {
        System.out.println("View "+viewName+" Update to "+message);
    }
    
}

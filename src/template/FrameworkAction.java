/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

/**
 *
 * @author thetkhine
 */
abstract public class FrameworkAction {
    
    private void auth()
    {
        System.out.println("Authentication");
    }
    private void logging()
    {
        System.out.println("Logging");
    }
    protected abstract void businessLogic();
    
    public void process()
    {
        this.auth();
        this.businessLogic();
        this.logging();
    }
}

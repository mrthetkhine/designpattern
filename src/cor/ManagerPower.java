/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cor;

/**
 *
 * @author Mr T.Khine
 */
public class ManagerPower extends PurchasePower{

    static final int ALLOW = BASE * 10;
    @Override
    void handleRequest(Command command) {
        if(command.amount <= ALLOW )
        {
            System.out.println("Sale handled by Manager");
        }
        else
        {
            if(this.getSuccessor()!=null)
            {
                successor.handleRequest(command);
            }
            
        }
    }
    
}

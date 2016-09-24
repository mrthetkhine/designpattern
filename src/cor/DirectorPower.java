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
public class DirectorPower extends PurchasePower{

    static final int ALLOW = BASE * 20;
    @Override
    void handleRequest(Command command) {
        if(command.amount <= ALLOW )
        {
            System.out.println("Sale handled by Director");
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

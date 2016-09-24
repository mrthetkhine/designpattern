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
public class VicePresident extends PurchasePower{

    static final int ALLOW = BASE * 30;
    @Override
    void handleRequest(Command command) {
        
        System.out.println("Sale handled by Vice President");
        
    }
    
}

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
abstract class PurchasePower {
   static final int BASE = 10;
   
   PurchasePower successor;
   
   abstract void handleRequest(Command command);

    public PurchasePower getSuccessor() {
        return successor;
    }

    public void setSuccessor(PurchasePower successor) {
        this.successor = successor;
    }
   
}

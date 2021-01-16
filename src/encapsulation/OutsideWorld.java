/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author thetkhine
 */
public class OutsideWorld {
    public static void main(String[] args) {
        Human human = new Human("TK",36);
        
        human.setAge(1000);
        
        human.show();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author thetkhine
 */
public class PolymorhipsmDemo {
    public static void main(String[] args) {
        Human h = new Doctor();
        h.display();
        
        h = new Teacher();
        h.display();
        
    }
}

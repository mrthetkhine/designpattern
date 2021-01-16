/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principle.coupling;

/**
 *
 * @author thetkhine
 */
public class CouplingDemo {
    public static void main(String[] args) {
        Module1 m1 = new Module1();
        m1.moduleMethod();
    }
}

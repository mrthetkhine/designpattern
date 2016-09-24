/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdkdynamicproxy;

/**
 *
 * @author Mr T.Khine
 */
public class SaleBusiness implements BusinessLogic {

    @Override
    public void doAction() {
        System.out.println("Doing Sale");
    }
    
}

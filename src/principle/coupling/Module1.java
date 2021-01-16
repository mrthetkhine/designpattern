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
public class Module1 {
    Module2 m2 = new Module2();
    
    void moduleMethod()
    {
        System.out.println("Module1 method call module 2 method");
        m2.method();//loose coupling
        
        m2.data = 1000;//tight coupling
    }
}
class Module2
{
    int data;//int data2 ;
    public void method()
    {
        this.data = 100;//Cohesion
        System.out.println("Module 2 Method ");
        this.method2();//Cohension
    }
    
    public void method2()
    {
        System.out.println("Module 2 method 2");
    }
}
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
public class Human {
    void display()
    {
        System.out.println("I am human");
    }
}
class Teacher extends Human
{
    @Override
    void display()
    {
        System.out.println("I am teacher");
    }
}
class Doctor extends Human
{
    @Override
    void display()
    {
        System.out.println("I am Doctor");
    }
}
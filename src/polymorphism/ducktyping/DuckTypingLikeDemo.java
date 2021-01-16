/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism.ducktyping;

/**
 *
 * @author thetkhine
 */
interface Flyable
{
    void fly();
}
class Bird implements Flyable
{

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}
class Aeroplane implements Flyable
{

    @Override
    public void fly() {
        System.out.println("Aeroplane is flying");
    }
}
public class DuckTypingLikeDemo {
    public static void main(String[] args) {
        Flyable f = new Bird();
        f.fly();
        
        f = new Aeroplane();
        f.fly();
    }
}

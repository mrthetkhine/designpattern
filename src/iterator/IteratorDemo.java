/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author Mr T.Khine
 */
public class IteratorDemo {
    public static void main(String[] args) {
        OurCollection coll = new OurCollection(new String[]{"1","2","3","4"});
        Iterator it = coll.createIterator();
        while(it.hasNext())
        {
            System.out.println("Next "+ it.next());
        }
        
    }
}

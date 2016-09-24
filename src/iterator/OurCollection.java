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
public class OurCollection implements Iterable{

    String[] strArr ;
   
    
    OurCollection(String []str)
    {
        strArr = str;
    }
    @Override
    public Iterator createIterator() {
        return new OurCollectionIterator();
    }
    class OurCollectionIterator implements Iterator
    {
        int counter =0;
        @Override
        public boolean hasNext() {
            return counter < strArr.length;
        }

        @Override
        public Object next() {
            return strArr[counter ++];
        }
    }
    
}

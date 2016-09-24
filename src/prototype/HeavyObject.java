/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mr T.Khine
 */
public class HeavyObject implements Prototype{

    String propertyGetFromDB;
    String computationalHungryProperty;

   

    static String getPropertyFromDB()
    {
        return "PropertyFromDb";
    }
    static String getCompuationalHungryProperty()
    {
        return "ComputationHungryProperty";
    }
    public HeavyObject() {
        this.propertyGetFromDB = HeavyObject.getPropertyFromDB();
        this.computationalHungryProperty = HeavyObject.getCompuationalHungryProperty();
    }

    
    @Override
    public HeavyObject reproducce() {
        try {
            
            Prototype cop = (Prototype)super.clone();
            HeavyObject newObject = (HeavyObject)cop;
            
            return newObject;
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "HeavyObject{" + "propertyGetFromDB=" + propertyGetFromDB + ", computationalHungryProperty=" + computationalHungryProperty + '}';
    }

   
    
}

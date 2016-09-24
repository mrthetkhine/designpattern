/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter.objectadapter;

import adapter.classadpater.*;
import adapter.Framework;

/**
 *
 * @author Mr T.Khine
 */
public class ObjectAdpater  implements Framework{
    
    OldAPI oldAPI = new OldAPI();
    
    @Override
    public void add(Integer item) {
        oldAPI.addItem(item);//Here call to old API method
    }
    public static void main(String[] args) {
        Framework framework = new ObjectAdpater();
        framework.add(30);
    }
}

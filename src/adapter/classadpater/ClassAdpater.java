/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter.classadpater;

import adapter.Framework;

/**
 *
 * @author Mr T.Khine
 */
public class ClassAdpater extends OldAPI implements Framework{

    @Override
    public void add(Integer item) {
        this.addItem(item);//Here call to old API method
    }
    public static void main(String[] args) {
        Framework framework = new ClassAdpater();
        framework.add(30);
    }
}

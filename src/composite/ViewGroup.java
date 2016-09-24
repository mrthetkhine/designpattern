/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mr T.Khine
 */
public class ViewGroup extends UIWidget{

    List<UIWidget> children = new ArrayList<UIWidget>();
    
    public ViewGroup(String id) {
        super(id);
    }
    public void add(UIWidget child)
    {
        this.children.add(child);
    }
    
    @Override
    void paint() {
        System.out.println("Paint "+this.id);
        for(UIWidget child : this.children)
        {
            child.paint();
        }
    }
    
}

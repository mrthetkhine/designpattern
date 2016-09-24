/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import java.util.ArrayList;

/**
 *
 * @author Mr T.Khine
 */
public class Invoker {
    ArrayList<Command> history = new ArrayList<Command>();
    
    public void invoke(Command command)
    {
        history.add(command);
        command.execute();
    }
    public void undo()
    {
        int len = this.history.size()-1;
        Command command = history.get( len );
        history.remove(len);
        System.out.println("Undo ");
        command.execute();
    }
}

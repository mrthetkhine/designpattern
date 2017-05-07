/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author Mr T.Khine
 */
public class CommandDemo {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Command copy = new CopyCommand();
        invoker.invoke(copy);
        
        Command paste = new Paste();
        invoker.invoke(paste);
        
        invoker.undo();
        invoker.undo();
    }
}

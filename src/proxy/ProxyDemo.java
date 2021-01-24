/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author Mr T.Khine
 */
public class ProxyDemo {
    public static void main(String[] args) throws Exception {
        CommandExecutor command = new CommandExecutorProxy("admin", "admin");
        command.runCommand("notepad.exe");
        
        command = new CommandExecutorProxy("admin", "admin1");
        command.runCommand("rm");
        
    }
    
}

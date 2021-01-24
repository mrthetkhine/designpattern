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
public class CommandExecutorImpl implements CommandExecutor{

    @Override
    public void runCommand(String cmd) throws Exception {
        //Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }
    
}

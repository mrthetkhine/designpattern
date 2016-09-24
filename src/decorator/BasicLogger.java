/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Mr T.Khine
 */
public class BasicLogger implements Logger{

    @Override
    public String log(String msg) {
        return msg;
    }
    
}

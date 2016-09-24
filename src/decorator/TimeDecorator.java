/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import java.util.Date;

/**
 *
 * @author Mr T.Khine
 */
public class TimeDecorator implements Logger{

    Logger logger;

    public TimeDecorator(Logger logger) {
        this.logger = logger;
    }
    
    
    @Override
    public String log(String msg) {
        Date date =new Date();
        return date.toString() +" "+ logger.log(msg);
    }
    
}

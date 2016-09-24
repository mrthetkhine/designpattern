/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Mr T.Khine
 */
public class Logger {
    private static Logger instance;
    private Logger()
    {        
    }
    
    public static Logger getLogger()
    {
        if(instance == null)
        {
            instance = new Logger();
        }
        return instance;
    }
    public void log(String text)
    {
        System.out.println("Log> "+ text);
    }
}

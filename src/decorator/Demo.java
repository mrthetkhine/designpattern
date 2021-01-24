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
public class Demo {
    public static void main(String[] args) {
        //Logger lg = new HTMLDecorator(new TimeDecorator(new BasicLogger()));
        Logger lg = new HTMLDecorator((new BasicLogger()));
        String msg = lg.log("LogString");
        System.out.println(msg);
    }
}

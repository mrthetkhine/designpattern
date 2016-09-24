/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

/**
 *
 * @author Mr T.Khine
 */
public class JavaPlatform implements Platform{

    public JavaPlatform() {
        System.out.println("Create Java Platform");
    }

    
    @Override
    public void execute(Code code) {
        System.out.println("Execcute "+code.getCode()+" On Java");
    }
    
}

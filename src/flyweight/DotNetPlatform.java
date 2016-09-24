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
public class DotNetPlatform implements Platform{

    public DotNetPlatform() {
        System.out.println("Create .net platform");
    }

    
    @Override
    public void execute(Code code) {
        System.out.println("Execute Code "+code.getCode()+" on DotNet ");
    }
    
}

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
public class FlywieghtDemo {
    
    public static void main(String[] args) {
        Code javaCode = new Code("Java program");
        Code dotNetCode = new Code("C#Program");
        
        Platform p = PlatformFactory.getInstance(".NET");
        p.execute(dotNetCode);
        
        Platform java = PlatformFactory.getInstance("JAVA");
        java.execute(javaCode);
        
        java = PlatformFactory.getInstance("JAVA");
        java.execute(javaCode);
        
        
        p = PlatformFactory.getInstance(".NET");
        p.execute(dotNetCode);
    }
}

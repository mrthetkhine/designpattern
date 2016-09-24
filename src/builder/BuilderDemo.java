/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Mr T.Khine
 */
public class BuilderDemo {
    
    public static void main(String[] args) {
        User u = new User()
                .firstName("Thet")
                .lastName("Khine ")
                .age(30)
                .school("UCSY")
                .address("North Okkalapa");
        System.out.println("User "+u);
    }
}

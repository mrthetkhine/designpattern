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
public class User {
    String firstName;
    String lastName;
    int age;
    String school;
    String address;

    public User(String firstName, String lastName, int age, String school, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.school = school;
        this.address = address;
    }
    
    public User()
    {
    }
    
    public User firstName(String firstName)
    {
        this.firstName = firstName;
        return this;
    }
    public User lastName(String lastName)
    {
        this.lastName = lastName;
        return this;
    }
    public User age(int age)
    {
        this.age = age;
        return this;
    }
    public User school(String school)
    {
        this.school = school;
        return this;
    }

    @Override
    public String toString() {
        return "User{" + "firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", school=" + school + ", address=" + address + '}';
    }
    public User address(String address)
    {
        this.address = address;
        return this;
    }
   
}

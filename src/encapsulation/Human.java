/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author thetkhine
 */
public class Human {
    private String name;
    private int age;
    
    Human(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if( age < 100)
        {
            this.age = age;
        }
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void show()
    {
        System.out.println("Show Name "+name + " Age "+age);
    }
}

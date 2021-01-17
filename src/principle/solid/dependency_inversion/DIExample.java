/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principle.solid.dependency_inversion;

/**
 *
 * @author thetkhine
 */
abstract class Engine
{
    abstract void start();
    
}
class GasEngine extends Engine
{

    @Override
    void start() {
        System.out.println("Gas Engine start");
    }
    
}
class DieselEngine extends Engine
{

    @Override
    void start() {
        System.out.println("DieselEngine Engine start");
    }
    
}

class Car
{
    Engine engine;
    
    Car(Engine engine)
    {
        this.engine = engine;
    }
    void startCar()
    {
        System.out.println("Car start");
        this.engine.start();
    }
}
public class DIExample {
    public static void main(String[] args) {
        Engine engine = new DieselEngine();//Mock
        
        Car car = new Car(engine);
        car.startCar();
    }
}

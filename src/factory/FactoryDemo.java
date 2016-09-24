/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author Mr T.Khine
 */
interface Logger
{
    void log(String message);
}
class ConsoleLogger implements Logger
{
    public void log(String message)
    {
        System.out.println("ConsoleLog > "+ message);
    }
}
class XMLLogger implements Logger
{
    public void log(String message)
    {
        System.out.println("XMLLog > "+ message);
    }
}
abstract class LoggerFactory
{
    abstract Logger getLogger();
}
class ConsoleFactory extends LoggerFactory
{

    @Override
    Logger getLogger() {
        return new ConsoleLogger();
    }
}
class XMLFactory extends LoggerFactory
{
    @Override
    Logger getLogger() {
        return new XMLLogger();
    }
}
public class FactoryDemo {
    public static void main(String[] args) {
        LoggerFactory factory = new ConsoleFactory();
        factory.getLogger().log("Message 1");
        
        factory = new XMLFactory();
        factory.getLogger().log("Message 2");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author Mr T.Khine
 */
class CPU
{
    public void freeze()
    {
        System.out.println("CPU Freeze");
    }
    public void jump()
    {
        System.out.println("Jump to instruction");
    }
    public void execute()
    {
        System.out.println("Execute");
    }
}
class Memory
{
    public void load()
    {
        System.out.println("Load Ram");
    }
}
class HardDisk
{
    public void readBootSector()
    {
        System.out.println("Read Bootsector");
    }
}
class Facade
{
    
    CPU cpu = new CPU();
    Memory memory = new Memory();
    HardDisk hardDisk = new HardDisk();
    
    public void start()
    {
        hardDisk.readBootSector();
        memory.load();
        cpu.jump();
        cpu.execute();
        
    }
}
public class FacadeDemo {
    
    public static void main(String[] args) {
        Facade demo = new Facade();
        demo.start();
    }
}

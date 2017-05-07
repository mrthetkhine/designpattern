/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Mr T.Khine
 */
public class StrategyDemo
{
    public static void main(String[] args)
    {
        Context context = new Context();
        
        context.setStrategy(new SelectionSort());
        context.sort();
        
        context.setStrategy(new MergeSort());
        context.sort();
    }
}

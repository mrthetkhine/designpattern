/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

/**
 *
 * @author thetkhine
 */
public class TemplateDemo {
    public static void main(String[] args) {
        FrameworkAction action = new SaleAction();
        action.process();
        
        action = new ReportAction();
        action.process();
    }
}

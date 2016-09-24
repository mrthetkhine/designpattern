/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author Mr T.Khine
 */
abstract class Shape {
   DrawingAPI api;
   
   Shape(DrawingAPI api)
   {
       this.api = api;
   }
   abstract void draw();
}

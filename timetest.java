/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication58;
import javaapplication58.Time;

public class timetest {
   public static void main(String args[])
   {
     Time obj1= new Time(3,10,59);
     Time obj2= new Time(2,50,1);
     Time result = new Time();
     Time temp= result.TimeAdd(obj1, obj2);
    // result.TimeAdd(obj1, obj2);
     
    System.out.println(temp.hh+":"+temp.mm+":"+temp.ss);
    //System.out.println(result.hh+":"+result.mm+":"+result.ss);
     
   }
}

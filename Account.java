/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication58;

/**
 *
 * @author student
 */
public class Account {
     String name;
     Double accno;
     String type;
     static int balance=0;
     static double cbalance=0;
     static double sbalance=0;
     static int flag=0;
     Account()
     {}
     void display()
     {
     System.out.println("Name:"+name);
     System.out.println("Total Balance:"+balance);
     if(type=="current"){
        System.out.println("Type:"+type);
        System.out.println("cbalance:"+cbalance);
        if(flag==1)
        {
            System.out.println("You have low balance");
        }
     }
     
      else
      {
          System.out.println("Type:"+type);
        System.out.println("sbalance:"+sbalance);
        if(flag==1)
        {
            System.out.println("You have low balance");
        }
      }
}
}

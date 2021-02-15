/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication58;
import javaapplication58.Account;

/**
 *
 * @author student
 */
public class CurrentAcc extends Account
{  
     CurrentAcc(String n, double acc)
     {  
        name=n;
        accno=acc;
        type="current";
     
     }
     
     
     
     static void  deposit(int m)
     {
         cbalance=cbalance+m;
         balance=balance+m;
        
        
     } 
          static void  withdraw(int m)
     {
         cbalance=cbalance-m;
         balance=balance-m;
         if(balance<1000)
         { System.out.println("PENALITYYYYYYYYYY");
         flag=1;
         }
      
        
     } 
          
          
     
     

    
}
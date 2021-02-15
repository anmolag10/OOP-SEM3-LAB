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
public class savingaccounts extends Account {
    
     savingaccounts(String n, double acc)
     {
        name=n;
        accno=acc;
        type="saving";
     
     }
     
     
     
     static void  deposit(int m, int rate, int time)
     {   m=m*rate*time;
         sbalance=sbalance+m;
         balance=balance+m;
        
        
     } 
          static void  withdraw(int m)
     {
         sbalance=sbalance-m;
         balance=balance-m;
         if(balance<1000)
         {
         System.out.println("PENALITYYYYYYYYYY");
         flag=1;
         }
        
     } 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication58;

import javaapplication58.CurrentAcc;
import javaapplication58.savingaccounts;
import javaapplication58.Account;

public class accountmain {
    public static void main(String args[])
    {
    CurrentAcc obj = new CurrentAcc("Anmol Agarwal",1909);
    CurrentAcc.deposit(10000);
    CurrentAcc.withdraw(9999);
    obj.display();
           }
}

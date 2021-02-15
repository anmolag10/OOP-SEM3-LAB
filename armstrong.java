/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication58;
import java.util.Scanner;


public class armstrong {
    
    
    
    public static void main(String args[])
    {
        int num, cpy,ld,armcheck=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
         num = in.nextInt();
         cpy=num;
         
         while(cpy>0)
         {
             ld=cpy%10;
             cpy=cpy/10;
             armcheck=armcheck+ld*ld*ld;
         }
         if(armcheck==num)
         {
             System.out.println(num+" is a Amstrong Number");
         }
         
         else
         {
              System.out.println(num+" is not a Amstrong Number");
         }
    }
    
}

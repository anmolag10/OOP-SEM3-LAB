/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication58;
public class factorial {
    
   static int factnum(int n)
    {   int fact=1;
        for(int i=n;i>0;i--)
        {
            fact=fact*i;
        }
        
        return fact;
    }
    
    
    public static void main( String[] args)
    {    int n=factnum(4);
        
        System.out.println(n);
    }
    
}

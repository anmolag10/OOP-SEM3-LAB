/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication58;
import java.util.Scanner;
public class searcharray {
     public static void main (String args[])
     {   Scanner in =  new Scanner(System.in);
         int[] arr = {1,2,3,4,5,5,1,1,9,10};
         int key;
         System.out.println("Enter the number to searched:");
         key=in.nextInt();
         
         int index=0;
         for(int x : arr)
         {  
             if(x==key)
             {
                 System.out.printf(" %d is at position a[%d]",key,index);
                 System.out.println();
             }
             index++;
         }
        
     
     }
}

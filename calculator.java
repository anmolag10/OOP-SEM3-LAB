package javaapplication58;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class calculator {
    
    public static void main (String args[])
    {
      float a,b;
      char op;
      char exit='y';
      do
      {   Scanner in = new Scanner(System.in);
          System.out.println("Enter the Number A: ");
          a=in.nextFloat();

          System.out.println("Enter the Number B: ");
          b=in.nextFloat();
          System.out.println("Enter the operator:");
          op=in.next().charAt(0);
          switch(op)
          {
              case '+':
                  System.out.println(a+b);
              break;
              case '-':
                  System.out.println(a-b);
              break;
              case '*':
                  System.out.println(a*b);
              break;
              case '/':
                  System.out.println(a/b);
              break;
              default:
                  System.out.println("Wrong Operator!!!");
                  
          }
          System.out.println("Do you want to continue: ");
          exit=in.next().charAt(0);
      
      }
          
          
          
      while(exit=='y' || exit=='Y');
      
    
    
    
    }
    
}

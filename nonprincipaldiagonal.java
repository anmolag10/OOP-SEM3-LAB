/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication58;

import java.util.Scanner;
public class nonprincipaldiagonal {
    public static void main( String args[])
    {
    int[][] arr={{1,2,3},{4,5,6},{6,8,9}};
    int i,j,sump=0;
    for( i=0;i<arr.length;i++)
    {
         for( j=0;j<arr[i].length;j++)
        {
            if((i+j+1)==3){
                System.out.print(arr[i][j]+"\t");
            sump=sump+arr[i][j];
            }
        }
    }    System.out.println();
        System.out.println("SUM OF NON PRINCIPAL DIAGONAL ELEMENTS IS: " + sump);
    }
    
    }


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication58;
import javaapplication58.Book;
public class bookmain {
    public static void main(String args[])
    {
    Book obj[] = new Book[6];
    obj[0]= new Book("A","Harry","1A");
    obj[1]= new Book("B","Carry","1A");
    obj[2]= new Book("B","Carry","1A");
    obj[3]= new Book("BASDA","Harry","1ADSAA");
    obj[4]= new Book("DSADAB","Harry","1DSADAA");
    obj[5]= new Book("B","Carry","1A");
    int i=0;
    for( i =0; i<obj.length;i++)
    {
        if(obj[i].author.equals("Harry"))
        {
        obj[i].Display();}
    }
    
    
    
    }
    
}

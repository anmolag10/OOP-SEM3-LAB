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
public class Book {
    String title;
    String author;
    String edition;
    
    Book( String t, String a, String e)
    {
        title=t;
        author=a;
        edition=e;
    }
    
    void Display()
    {
    System.out.println("Title:"+this.title);
    System.out.println("Author:"+this.author);
    System.out.println("Edition:"+this.edition);
    
    
    }
    
}


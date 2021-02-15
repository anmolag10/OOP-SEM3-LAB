/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication58;


public class Time {
    int hh;
    int mm;
    int ss;
    Time()
    {
        hh=mm=ss=0;
    }
    
    Time( int h, int m, int s)
    { 
        if(h>23)
        {System.out.println("Wrong Time given");}
        else{
                hh=h;
                if(m < 60 && s <60)  
                {
                    mm=m;
                    ss=s;
                }
                
               else
                {
                    System.out.println("Wrong Time given");
                }
            }
    }
    
   Time TimeAdd(Time obj1, Time obj2)
    {   int seccarry=0,mincarry=0;
    
        int sumsec=obj1.ss+obj2.ss;
        if (sumsec>59)
        {
           sumsec=sumsec-60;
           seccarry=1;
        }
        int summin=obj1.mm+obj2.mm+seccarry;
        if (summin>59)
        {
           summin=summin-60;
           mincarry=1;
        }
        int sumhrs=obj1.hh+obj2.hh+mincarry;
        if (sumhrs>23)
        {
           sumhrs=sumhrs-24;
          
        }
//       this.hh=sumhrs;
//       this.mm=summin;
//       this.ss=sumsec;
       
      Time obj3 = new Time(sumhrs,summin,sumsec);      
       return obj3;
      
        
    }
}

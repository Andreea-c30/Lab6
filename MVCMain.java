import java.io.*;
import java.lang.Thread;
import java.util.Scanner;    
import java.util.Random;
import java.lang.*;
import controllers.*;
import models.*;
import views.*;
// main class  
import java.util.Random;
public class MVCMain {  
      
public static int  pass, fail,taxlab;
         public static void main(String[] args) {
         try{
         
         Functions a=new Functions();
         RetriveData b=new RetriveData();
         String[] Infodisciplines={"Mathematichs","Graphics","Science","English","Programing","Design","Modeling"};
         String[] Sciencedisciplines={"Mechanics","Physics","Chemestry","English","Science"};
         int loop=0;
         int  total=0,full=0,part=0 ,month=0;
         
      
           while(true){
            int stud=b.random(1,3);
            int dep=b.random(1,2);
               if(stud<=2 ){
                  a.full_student();
                  full++;
                  
                  if(dep==1)
                  {
                     a.info();
                     a.labs(Infodisciplines);
                     a.midterm(Infodisciplines);
                     a.exams(Infodisciplines);
                  }
                  else
                  {
                     a.science();
                     a.labs(Sciencedisciplines);
                     a.midterm(Sciencedisciplines);
                     a.exams(Sciencedisciplines);
                  }
            }
            else
                 {
                  a.part_student();
                  part++;
                  if(dep==1)
                     {
                       a.info();
                        a.labs(Infodisciplines);
                        a.midterm(Infodisciplines);
                        a.exams(Infodisciplines);
                     }
                     else
                     {
                        a.science();
                        a.labs(Sciencedisciplines);
                        a.midterm(Sciencedisciplines);
                        a.exams(Sciencedisciplines);
                     }      
                 }
                 total++;
                 loop++;
                 month++;
                 if(loop%150==0){
                   System.out.println("\n\nMonthy Statistics \nTotal students :"+total
                  +"\nThis month total students: "+month
                 +"\nPart time students: "+part
                  +" Full time students: "+full);
                     Thread.sleep(2000); 
                     month=0;
                 }
                 if(loop%800==0){
                   System.out.println("\n\nYearly Statistics \nTotal students :"+total
                 +"\nPart time students: "+part
                  +" Full time students: "+full
                  +"\nMoney gain from lab taxes: "+taxlab+"lei");
                  taxlab=0;

                     Thread.sleep(4000); 
                 }
                 if(loop%400==0){
                    pass=b.var_pass();
                    fail=b.var_fail();
                    taxlab=b.var_taxlab();
                  int studtot=fail+pass;
                  int failpercent=(fail*100)/studtot;
                  int pasperc=100-failpercent;
                  System.out.println("\nSession statistics: "
                  +"\nFailes :"+failpercent
                  +"%  Passed :"+pasperc+"%");
                  pass=0;
                  fail=0;
                   Thread.sleep(2000); 
                 }
                 
            }

                
         }
             catch(InterruptedException ex)
      {
         ex.printStackTrace();
      }
    }
    
    
       
    }   
        


        
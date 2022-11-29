import java.io.*;
import java.lang.Thread;
import java.util.Scanner;    
import java.util.Random;
import java.lang.*;
import controllers.*;
import models.*;
import views.*;
import java.util.Random;
public class RetriveData {  
      
public static int  pass, fail,taxlab;
      //function to generate random integers
          public static int random(int min, int max){
          int b = (int)(Math.random()*(max-min+1)+min); 
          return b;
    }
         //data about full time students
     
            
       
           public static Full_time retriveStudentsFromDatabase(){  
              Full_time st = new Full_time();   
              String[] firstName={"Nicole ","Eduard","Yazmin","Joe","Jane","Jessy","Anne","Elsa","Mia","Chris","Abel","Jack","Clar"};
              String[] lastName={"Johnson","Houghes","Wang","Wagk","Rios","Berret","Foster","Parker","Yu","Pratt","Burn","Lane","Blake"};
              Random index=new Random();
              st.setName(firstName[index.nextInt(firstName.length)]+" "+lastName[index.nextInt(lastName.length)]);
              int b = random(200,400); 
              st.setId(b);
              return st;
           }

           //data about part time students
   
            
       
           public static Part_time retrivePartStFromDatabase(){  
              Part_time st = new Part_time();   
              String[] firstName={"Nicole","Talia","Travis","Carolyn","Devon","Kristen","Litsy","Avery","Darian","Deacon","Gia","Jae"};
              String[] lastName={"Dominguez","Morton","Morton","Booker","Velazquez","Sharp","Dev","Benton","Pope","Campbell","Yates","Oneal"};
              Random index=new Random();
              st.setName(firstName[index.nextInt(firstName.length)]+" "+lastName[index.nextInt(lastName.length)]);
              int b = random(100,200); 
              st.setId(b);
              return st;
           }
    
   
     //data about labs
   
            
       
           public static Laboratory retriveLabFromDatabase(String[] disciplines){  
            
               Laboratory lab=new Laboratory();  
               Random index=new Random();
               lab.setObj(disciplines[index.nextInt(disciplines.length)]);
               int ls=random(1,5);
               int abs=random(1,20);
               boolean adm;
               if(ls<=2){
                  adm=false;
               }
               else 
                  adm=true;
               lab.setAdmis(adm);
               double money=abs*30;
               taxlab+=money;
               lab.setTax(money);
              
              return lab;
           }

         //data about midterms
              public static Midterms retriveMidFromDatabase(String[] disciplines){  
              Midterms mid = new Midterms();   
              Random index=new Random();
              mid.setObj(disciplines[index.nextInt(disciplines.length)]);
              int gr1=random(3,10);
              int gr2=random(3,10);
              mid.setMid1(gr1);
              mid.setMid2(gr2);
              double fin=(gr1+gr2)/2;
              mid.setFinal(fin);
              
              return mid;
             
           }
            //data about exams
           public static Exams retriveExamsFromDatabase(String[] disciplines){  
              Exams exam = new Exams();   
              exam.setAdmis(true);
              Random index=new Random();
              exam.setObj(disciplines[index.nextInt(disciplines.length)]);
              String ql;
              int i=random(1,5);
              if(i>=2){
               ql="Pass exam";
               pass++;
              }
              else 
              {
               ql="Fail exam";
               fail++;
              }
              exam.setQual(ql);
              return exam;
           }

         //data about informatics department
       
           public static Informatics retriveInfoFromDatabase(){  
              Informatics info = new Informatics();   
              info.setDepartment("Informatics");
              info.setNr_st(1000);
             
              
              return info;
           }

           //data about science department
  
           public static Science retriveSciFromDatabase(){  
              Science sc = new Science();   
              sc.setDepartment("Science");
              sc.setNr_st(4000);
             
              
              return sc;
           }

             public static int var_pass(){
                    return pass;
                }
            public static int var_fail(){
                    return fail;
                }
            public static int var_taxlab(){
                    return taxlab;
                }
            
    
       
    }   
        


        
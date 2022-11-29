import java.io.*;
import java.lang.Thread;
import java.util.Scanner;    
import java.util.Random;
import java.lang.*;
import controllers.*;
import models.*;
import views.*;
import java.util.Random;
public class Functions{  
   public static  RetriveData c=new RetriveData();
         //data about full time students
            public static void full_student(){  
        
              Full_time model = c.retriveStudentsFromDatabase();  
       
              // creating a view to write Students details on console  
              Full_timeView view = new Full_timeView();  
       
              Full_timeController controller = new Full_timeController(model, view);  
       
              controller.updateView();  
       
            }
            


           //data about part time students
           public static void part_student(){  
       
              Part_time model = c.retrivePartStFromDatabase();  
       
              // creating a view to write Students details on console  
              Part_timeView view = new Part_timeView();  
       
              Part_timeController controller = new Part_timeController(model, view);  
       
              controller.updateView();  
       
            }
            

     //data about labs
           public static void labs(String[] disciplines){  

              Laboratory model = c.retriveLabFromDatabase( disciplines);  
   
              LaboratoryView view = new LaboratoryView();  
       
              LaboratoryController controller = new LaboratoryController(model, view);  
       
              controller.updateView();  
              
            }
            
    

         //data about midterms
           public static void midterm(String[] disciplines){  

              Midterms model = c.retriveMidFromDatabase(disciplines);  

              MidtermsView view = new MidtermsView();  
       
              MidtermsController controller = new MidtermsController(model, view);  
       
              controller.updateView();  
       
            }

            //data about exams
           public static void exams(String[] disciplines){  

              Exams model = c.retriveExamsFromDatabase( disciplines);  
       
              ExamsView view = new ExamsView();  
       
              ExamsController controller = new ExamsController(model, view);  
       
              controller.updateView();  
       
            }
            

         //data about informatics department
           public static void info(){  
       
              Informatics model = c.retriveInfoFromDatabase();  
       
              InformaticsView view = new InformaticsView();  
       
              InformaticsController controller = new InformaticsController(model, view);  
       
              controller.updateView();  
       
            }
            

           //data about science department
           public static void science(){  
       
              Science model = c.retriveSciFromDatabase();  
       
              ScienceView view = new ScienceView();  
       
              ScienceController controller = new ScienceController(model, view);  
       
              controller.updateView();  
       
            }
            
  

       
    }   
        


        
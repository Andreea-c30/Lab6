package controllers;
import models.*;
import views.*;
public class ExamsController{   
    // declaring the variables model and view  
           private Exams model;  
           private ExamsView view;  
       
          // constructor to initialize  
     public ExamsController(Exams model, ExamsView view) {  
              this.model = model;  
              this.view = view;                
           }  

           public ExamsController(){}
 
           public void setExamObj(String obj){  
              model.setObj(obj);        
           }  
       
           public String getExamObj(){  
              return model.getObj();         
           }  

          public boolean getExamAdmis(){  
            return model.getAdmis();
          }  
            
          public void setExamAdmis(boolean admis){  
            model.setAdmis(admis) ; 
          }  
        
           public String getQualif() {  
          return model.getQual();  
          }  
          
          public void setQualif(String qual) {  
                model.setQual(qual) ;
          }  

           // method to update view   
           public void updateView() {                  
              view.printExamDetails(model.getObj(),model.getQual());  
           }     
   
   
}  
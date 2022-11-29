package controllers;
import models.*;
import views.*;
public class ScienceController{  
 
  // declaring the variables model and view  
           private Science model;  
           private ScienceView view;  
               
        
          public ScienceController(Science model, ScienceView view) {  
              this.model = model;  
              this.view = view;  
              
           }  
           public ScienceController(){}
 
           public void setDep(String d){  
              model.setDepartment(d);        
           }  
       
           public String getDep(){  
              return model.getDepartment();         
           }  
       
        
          public void setNrst(int nr){
            model.setNr_st(nr);
          }

          public int getNrst(){
            return model.getNr_st();
          }

           // method to update view   
           public void updateView() {                  
              view.printSciDetails(model.getDepartment(),model.getNr_st());  
           }   

           //////////////////////////////////////////////////////////////////////////////////




    
} 
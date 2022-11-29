package controllers;
import models.*;
import views.*;
public class InformaticsController{  
 
  // declaring the variables model and view  
           private Informatics model;  
           private InformaticsView view;  
               
        
          public InformaticsController(Informatics model, InformaticsView view) {  
              this.model = model;  
              this.view = view;  
              
           }  
           public InformaticsController(){}
 
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
              view.printInfoDetails(model.getDepartment(),model.getNr_st());  
           }   
    
} 
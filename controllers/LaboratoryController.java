package controllers;
import models.*;
import views.*;
public class LaboratoryController{  
  // declaring the variables model and view  
           private Laboratory model;  
           private LaboratoryView view;  
               
        
          public LaboratoryController(Laboratory model, LaboratoryView view) {  
              this.model = model;  
              this.view = view;  
              
           }  
           public LaboratoryController(){}

       
          // getter and setter methods   
           public void setLabObj(String obj){  
              model.setObj(obj);        
           }  
       
           public String getLabObj(){  
              return model.getObj();         
           }  
       
          public boolean getLabAdmis(){  
            return model.getAdmis();
          }  
            
          public void setLabAdmis(boolean admis){  
            model.setAdmis(admis) ; 
          }  

          public double getLabTax(){  
            return model.getTax();
          }  
            
          public void setLabTax(double tax){  
            model.setTax(tax) ; 
          }       
   
           // method to update view   
           public void updateView() {                  
              view.printLabDetails(model.getObj(),model.getAdmis(),model.getTax());  
           }   



}  
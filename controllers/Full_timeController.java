package controllers;
import models.*;
import views.*;
// class that represents controller  
public class Full_timeController{  

          // declaring the variables model and view  
           private Full_time model;  
           private Full_timeView view;  
       
          // constructor to initialize  
           public Full_timeController(Full_time model, Full_timeView view) {  
              this.model = model;  
              this.view = view;  
           }  
       
          // getter and setter methods   
           public void setStudentName(String name){  
              model.setName(name);        
           }  
       
           public String getStudentName(){  
              return model.getName();         
           }  
       
           public void setStudentId(int id){  
              model.setId(id);        
           }  
       
           public int getStudentId(){  
              return model.getId();       
           }   
      
           // method to update view   
           public void updateView() {                  
              view.printStudentDetails(model.getName(), model.getId());  
           }      
        }  

        
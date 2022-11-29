package controllers;
import models.*;
import views.*;
public class MidtermsController{  
  // declaring the variables model and view  
           private Midterms model;  
           private MidtermsView view;  
               
        
          public MidtermsController(Midterms model, MidtermsView view) {  
              this.model = model;  
              this.view = view;  
              
           }  
           public MidtermsController(){}

       
           public void setMidObj(String obj){  
              model.setObj(obj);        
           }  
       
           public String getMidObj(){  
              return model.getObj();         
           }  
       
          public int getMid1Grade(){  
            return model.getMid1();
          }  
            
          public void setMid1Grade(int mid1){  
            model.setMid1(mid1) ; 
          }   
          public int getMid2Grade(){  
            return model.getMid2();
          }  
            
          public void setMid2Grade(int mid2){  
            model.setMid2(mid2) ; 
          }   


          public double getMidFinal(){  
            return model.getFinal();
          }  
            
          public void setMidFinal(double finalgr){  
            model.setFinal(finalgr) ; 
          }       
    
           // method to update view   
           public void updateView() {                  
              view.printMidDetails(model.getObj(),model.getMid1(),model.getMid2(),model.getFinal());  
           }   

}  
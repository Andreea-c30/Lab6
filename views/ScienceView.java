package views;
public class ScienceView {  
     void type(){
        System.out.println("---Departments---");
    } 
      // method to display details   
    public void printSciDetails (String department,int nr_st){
      type();  
          System.out.println("--->" +department
                              +"\tNr of students : "+nr_st); 
      adress();
          
      }  

     void adress(){
      String str="Big Cedar Way",code="408";
      System.out.println("Located on "+code+", "+str);
    }

    
    

    
} 
package models;
// class that represents model  
public class Full_time  extends Students{  

    // declaring the variables  
       private String StudentsName;  
       private int StudentsId;    
          
      // defining getter and setter methods  
       public int getId() {  
          return StudentsId;  
       }  
          
       public void setId(int id) {  
          this.StudentsId = id;  
       }  
          
       public String getName() {  
          return StudentsName;  
       }  
          
       public void setName(String name) {  
          this.StudentsName = name;  
       }   
       

   
}  
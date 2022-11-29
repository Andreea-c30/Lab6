package views;
public class InformaticsView {  
    
      // method to display details   
    public void printInfoDetails (String department,int nr_st){
          System.out.println("--->Entrolled at:" +department+" department"
                              +"\tNr of students : "+nr_st); 
      adress();
          
       }  

    void adress(){
      String str="Circle Ave",code="7577";
      System.out.println("Located on "+code+", "+str);
    }

    

    
} 
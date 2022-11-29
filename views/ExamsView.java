package views;
public class ExamsView {   

    void type(){
        System.out.println("\nEvaluation form : exam");
    } 

    // method to display the exams details   
    public void printExamDetails (String obj,String qual){
      type();  
          System.out.println("Discipline: "+obj
                              +"\nQualification : "+qual); 
          
         
       }  
   
}  
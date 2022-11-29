package views;
public class LaboratoryView{  

    void type(){
        System.out.println("---Laboratory---");
    } 
      // method to display details   
    public void printLabDetails (String obj,boolean admis,double tax){
      type();  
          System.out.println("\nDiscipline: "+obj
                              +"\nAdmited : "+admis
                              +"\nTax to pay : "+tax+" lei"); 
          
         
       }  
}  
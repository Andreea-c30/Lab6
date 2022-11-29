package views;
public class MidtermsView{  
   
    void type(){
        System.out.println("---Midterm---");
    } 

      // method to display details   
    public void printMidDetails (String obj,int mid1,int mid2, double finalgr){
      type();  
          System.out.println("Discipline: "+obj
                              +"\nMidterm 1: "+mid1+"\t2:"+mid2
                              +"\nFinal grade:"+finalgr); 
          
         
       } 
}  
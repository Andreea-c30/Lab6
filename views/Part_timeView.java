package views;
// class that represents view  
public class Part_timeView{  

    void type(){
        System.out.println("Goes to university part time");
    }
    void duration(){
        int d=10,m=9,y=2022;
        int fd=25,fm=9,fy=2022;
        System.out.println("Study period : "+d+"."+m+"."+y+"-"+fd+"."+fm+"."+fy);
    }
    
       // method to display the Student details   
public void printStudentDetails (String StudentName, int StudentId){  
          System.out.println("---->Student ->  Id: "+StudentId
                                +"\tName: "+StudentName); 
          type();
          duration();
       }  
}  



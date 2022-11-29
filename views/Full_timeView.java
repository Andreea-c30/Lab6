package views;
// class that represents view  
public class Full_timeView{  

    void type(){
        System.out.println("Goes to university full time");
    }
    void duration(){
        int d=1,m=9,y=2022;
        int fd=22,fm=6,fy=2023;
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


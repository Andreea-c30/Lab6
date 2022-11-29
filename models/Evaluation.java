package models;
abstract class Evaluation implements Root{  
    
    int d,m,y;
    //private data members  
    private String object;
    private boolean admis;
    private Students student;
    public void  welcome(){}
    
    public Evaluation(String object, boolean admis, Students student){
      this.object=object;
      this.admis=admis;
      this.student=student;
    }
    public Evaluation(){}
     
    public String getObj(){  
      return object;  
    }  
      
    public void setObj(String object){  
      this.object=object; 
    }  

    public boolean getAdmis(){  
      return admis;
    }  
      
    public void setAdmis(boolean admis){  
      this.admis=admis ; 
    }  
    public void setStudent(Students student){
      this.student=student;
    }

    public Students getStudent(){
      return student;
    }
    
}  
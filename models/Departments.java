package models;
//class representing a model
abstract class Departments implements Root{  
    //private data members  
    private String department,partners;  
    private int nr;
    
    //Declaring constructors
    public Departments(String department, String partners ){
      this.department=department;
      this.partners=partners;
    }
    public Departments(){}
    
    public String getDepartment(){  
      return department;  
    }  
     
    public void setDepartment(String department){  
      this.department=department ; 
    }
    public int getNr(){  
      return nr;  
    }  
   
    public void setNr(int nr){  
      this.nr=nr ; 
    }  

    public String getPartners(){  
      return partners;  
    }  
     
    public void setPartners(String partners){  
      this.partners=partners ; 
    }  
      
}  
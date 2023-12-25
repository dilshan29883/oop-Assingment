
package com.mycompany.q7;

public class Item {
    //include variable
    protected int location;
    protected String description;
    //constructor method
    public Item(int l,String d){
        int location=l;
        String description=d;
    }
    public void setlocation(int l){
        this.location=l;
        
    }
    public void setdescription(String d){
        this.description=d;
    }
    public int getlocation(int l){
        return location;
    }
    public String getdescription(String d){
        return description;
    }
     
     
    
    
    
}


package com.mycompany.q9;

public class car {
    protected int speed;
    protected double regularPrice;
    protected String color;

    

    public void car(int s,double r,String c){
        this.speed=s;
        this.regularPrice=r;
        this.color=c;
    }
    
    public double getSalePrice(){
        return regularPrice; 
    }
    
}

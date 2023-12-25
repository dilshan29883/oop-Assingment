
package com.mycompany.q9;

public class Truck  extends car{
    protected int weight;
    
    public void Truck(int s,double r,String c,int w){
        super.car(s, r, c);
        this.weight=w;
    }
    
    @Override
    public double getSalePrice(){
        int getsaleprice;
        if(weight>2000){
            getsaleprice=(int) ((regularPrice)-regularPrice*0.1);
        }
            else{
                   getsaleprice=(int) (regularPrice-(regularPrice)*0.2); 
                    }    
        return getsaleprice;
        
    }
    
}

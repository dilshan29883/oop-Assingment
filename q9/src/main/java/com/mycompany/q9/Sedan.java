
package com.mycompany.q9;

public class Sedan extends  car{
    protected int length;

    
    
    public void Sedan(int s,double r,String c,int l){
        super.car(s, r, c);
        this.length=l;
    }
    
    @Override
    public double getSalePrice(){
        int getsaleprice;
        if(length>20){
            getsaleprice=(int)((regularPrice)-regularPrice*0.05);
        }
        else{
                getsaleprice=(int)((regularPrice)-regularPrice*0.10);
                
            }
        return getsaleprice;
    }
    
}


package com.mycompany.q9;

public class Ford extends car {
    protected int year;
    protected int manufacturerdiscount;

   
    
    public void Ford(int s,double r,String c,int m,int y){
        super.car(s, r, c);
        this.manufacturerdiscount=m;
        this.year=y;
        
    }

    
    public double getsaleprice(){
        double saleprice=super.getSalePrice();
        saleprice=saleprice-manufacturerdiscount;
        return saleprice;
        
        }
    }

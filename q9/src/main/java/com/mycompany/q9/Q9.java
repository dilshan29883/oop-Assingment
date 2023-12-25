
package com.mycompany.q9;

public class Q9 {// MyOwnAutoShop

    public static void main(String[] args) {
       car c1=new car();
       c1.regularPrice=5000;
       c1.color="red";
       c1.speed=75;
       System.out.println("your car is :"+c1.getSalePrice());
       Truck t1=new Truck();
       t1.color="green";
       t1.regularPrice=65000;
       t1.speed=80;
       t1.weight=45000;
       System.out.println("your Truck is :"+t1.getSalePrice());
       Ford f1=new Ford();
       f1.color="black";
       f1.manufacturerdiscount=4500;
       f1.regularPrice=50000;
       f1.speed=100;
       f1.year=2023;
       System.out.println("your ford is :"+f1.getsaleprice());
       Sedan s1=new Sedan();
       s1.color="yellow";
       s1.length=80;
       s1.regularPrice=670000;
       s1.speed=1000;
       System.out.println("sedan  is :"+s1.getSalePrice());
       
       
       
        
    }
}

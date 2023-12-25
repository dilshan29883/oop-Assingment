
package com.mycompany.q7;

public class Q7 {

    public static void main(String[] args) {
        Item i1=new Item(20,"hey good product");
        i1.location=20;
        i1.description="hey good produt";
        System.out.println(i1.getlocation(20));
        System.out.println(i1.getdescription("hey good product"));
        Monster m1=new Monster(30,"hey good");
        m1.location=30;
        m1.description="hey good product";
        System.out.println(m1.getlocation(30));
        System.out.println(m1.getdescription("hey good product"));
        
       
    }
}

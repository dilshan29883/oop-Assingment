
package com.mycompany.q10;

public class Q10 {

    public static void main(String[] args) {
        //polymorphism shape 
        shape s1=new circle();
         s1.erase();
         s1.nameddraw();
        shape s2=new triangle();
        s2.erase();
        s2.nameddraw();
        
        shape s3=new square();
        s3.erase();
        s3.nameddraw();
         
        //debuging interface
         project p1=new project();
         p1.debug(new projectclass());
         p1.debug(new projectclass1());
         
         
    }
}

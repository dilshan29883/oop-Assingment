
package com.mycompany.q6;

public class Q6 {

    public static void main(String[] args) {
        //create and object
        date d=new date();
        d.setmonth(06);
        d.setday(22);
        d.setyear(2001);
        System.out.println(""+d.getmonth()+"/"+d.getday()+"/"+d.getyear());
    }
}

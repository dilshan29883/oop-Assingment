
package com.mycompany.q3;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        float f,c;
        Scanner fl=new Scanner(System.in);
        System.out.println("enter your fehrenheit value ");
        f=fl.nextFloat();
        f=f-32;
        c=f*0.5623f;
        System.out.println("hey today celsiue value is: " +(c));
    }
}


package com.mycompany.q2;
import java.util.Scanner;
public class Q2 {

    public static void main(String[] args) {
        //declrea the numbers
        int n1,n2,n3,sum;
        Scanner num=new Scanner(System.in);
        //print method 
        System.out.println("enter youe frist number :");
        n1=num.nextInt();
        System.out.println("enter your second number :");
        n2=num.nextInt();
        System.out.println("enter your thirdnumber :");
        n3=num.nextInt();
        //get to total value
        sum=n1+n2+n3;
        System.out.println("your total sum :" +sum);
        
        
        
    }
}

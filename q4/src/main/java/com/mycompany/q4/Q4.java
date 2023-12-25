
package com.mycompany.q4;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        int n1,n2,n3,sum,s,l;
        float avg;
        Scanner num=new Scanner(System.in);
        System.out.println("three numbers :");
        n1=num.nextInt();
        n2=num.nextInt();
        n3=num.nextInt();
        l=n1;
        if(l>n2){
            l=n2;
        }
        else if(l>n3){
            l=n3;
        }
        System.out.println("your largest is : " + l);
        s=n1;
        if(s<n2){
            s=n2;
        }
        else if(s<n3){
            s=n3;
        }
        System.out.println("your smallest is : " +s);
        sum=n1+n2+n3;
        System.out.println("your total sum is :" +sum);
        avg=sum/3;
        System.out.println("youe average is :" +avg);
    }
}

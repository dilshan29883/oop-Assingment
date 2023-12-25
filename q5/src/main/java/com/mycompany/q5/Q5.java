
package com.mycompany.q5;
import java.util.Scanner;

public class Q5 {

    public static float average(int g[],int m) {
        //start average mathod
        int i,sum;//initialize variable
        float avg=0.00f;
        for(i=1;i<m;i++){//loop and calculate the average
            sum=+g[i];
            avg=sum/(i);
        }
        return avg;//return the average after calculation
    }
    //strat the main method
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        int i, g[];//initialize variable
        g=new int[20];
        
        //start to loop 20 itmes
        for(i=0;i<20;i++){
            System.out.println("enter Grade :");
            g[i]=in.nextInt();//store next integer in grade [i]
            if(g[i]==-1){
                break;
            }
            
        }
        System.out.println("your grade is :"+average(g,i-1));
    }
}

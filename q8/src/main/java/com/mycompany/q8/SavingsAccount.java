
package com.mycompany.q8;

public class SavingsAccount {
    //declare variable
     protected static float  annualInterestRate;
     protected float savingsBalance;
     
     //Provide method
     public SavingsAccount(float sb){
         this.savingsBalance=sb;
     }
     //calculated method 
     public void calculateMonthlyInterest(){
         float MonthlyInterest=(savingsBalance*annualInterestRate)/12f;
         savingsBalance=savingsBalance+MonthlyInterest;
     }
     public static void modifyInterestRate(float anb){
         annualInterestRate=anb;
     }
     public float getSavingsAccount(){
         return savingsBalance;
     }
     
    
}

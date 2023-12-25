
package com.mycompany.q8;

public class Q8 {

    public static void main(String[] args) {
        SavingsAccount s1=new SavingsAccount(3000);
        SavingsAccount s2=new SavingsAccount(2000);
        
         // Set the annualInterestRate to 4%
        SavingsAccount.modifyInterestRate(0.004f);
        s1.calculateMonthlyInterest();
        s2.calculateMonthlyInterest();
        
        System.out.println("savers balance"+s1.getSavingsAccount());
        System.out.println("savers balance"+s2.getSavingsAccount());
        
        // Set the annualInterestRate to 5%
        SavingsAccount.modifyInterestRate(0.005f);
        s1.calculateMonthlyInterest();
        s2.calculateMonthlyInterest();
        
        System.out.println("savers balance"+s1.getSavingsAccount());
        System.out.println("savers balance"+s2.getSavingsAccount());
    }
}

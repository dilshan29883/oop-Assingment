
package com.mycompany.q6;

public class date {
    //data
    //declearing the variable
    private int month;
    private int day;
    private int year;
    
    //method
    //no parameters constructor
    public date(){
        month=0;
        day=0;
        year=0;
    }
    //initialize 
    //with parameter constriuctor
    public date(int m,int d,int y){
        month=m;
        day=d;
        year=y;
    }
    //setter method
    public void setmonth(int m){
        month=m;
    }
    public void setday(int d){
        day=d;
    }
    public void setyear(int y){
        year=y;
    }
    
    //getter method
    public int getmonth(){
        return month;
    }
    public int getday(){
        return day;
    }
    public int getyear(){
        return year;
    }
    
    //method to setdata
    public void deisplay(){
        System.out.println("your month :" +month);
        System.out.println("your day :"+ day);
        System.out.println("your year : " +year);
    }
    
}

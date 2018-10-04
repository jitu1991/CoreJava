package com.test.output;

public class SubClass extends SuperClass{
    
    SubClass(){
        s += "3";
    }
    
    static{
        new SubClass();
        System.out.println(s);
    }
    
    {s += "4";}

    public static void main(String[] args) {}
 
}
 

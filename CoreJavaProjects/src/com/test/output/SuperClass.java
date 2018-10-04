package com.test.output;

public class SuperClass {
    
    static String s = "";
    static {
        s += "1";
    }
    SuperClass(){
        s += "2";
    }
}

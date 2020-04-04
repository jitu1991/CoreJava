package com.test.indiabix;
interface Foo141 
{ 
    int k = 1; /* Line 3 */
} 
public class InterfaceTest implements Foo141 
{
    public static void main(String args[]) 
    {
        int i; 
        InterfaceTest test141 = new InterfaceTest(); 
        i = test141.k; /* Line 11 */
        System.out.println(i);
        i = InterfaceTest.k; 
        System.out.println(i);
        i = Foo141.k; 
        System.out.println(i);
    } 
}

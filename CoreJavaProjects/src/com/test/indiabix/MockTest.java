package com.test.indiabix;
class Super 
{ 
    public Integer getLength() 
    {
        return new Integer(4); 
    } 
} 

class Sub extends Super 
{ 
    /*public Long getLength() 
    {
        return new Long(5); 
    } */

    public static void main(String[] args) 
    { 
        Super sooper = new Super(); 
        Sub sub = new Sub(); 
        System.out.println( 
        sooper.getLength().toString() + "," + sub.getLength().toString() ); 
    } 
}
public class MockTest {
	/*final static short x = 2;
    public static int y = 0;
    public static void main(String [] args) 
    {
        for (int z=0; z < 4; z++) 
        {
            switch (z) 
            {
                case x: System.out.print("0 ");
                default: System.out.print("def ");
                case x-1: System.out.print("1 ");  
                            break;
                case x-2: System.out.print("2 ");
            }
        }
    }*/
	
	 /*private static float[] f = new float[2]; 
	    public static void main (String[] args) 
	    {
	        System.out.println("f[0] = " + f[0]); 
	    } */
}

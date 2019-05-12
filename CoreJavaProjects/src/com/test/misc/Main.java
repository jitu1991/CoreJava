package com.test.misc;

class Test1
{
    int x;
    Test1(int i) { x = i; }
    Test1()      { x = 0; }
}
 

public class Main {
	/*public static void main(String[] args)
    {
        // t is a reference
        Test1 t = new Test1(5);
 
        // Reference is passed and a copy of reference
        // is created in change()
        change(t);
 
        // Old value of t.x is printed
        System.out.println(t.x);
    }
    public static void change(Test1 t)
    {
        // We changed reference to refer some other location
        // now any changes made to reference are not reflected
        // back in main
        t = new Test1();
 
        t.x = 10;
    }*/
	
	
	/*public static void main(String[] args)
    {
        // t is a reference
        Test1 t = new Test1(5);
 
        // Reference is passed and a copy of reference
        // is created in change()
        change(t);
 
        // New value of x is printed
        System.out.println(t.x);
    }
 
    // This change() doesn't change the reference, it only
    // changes member of object referred by reference
    public static void change(Test1 t)
    {
        t.x = 10;
    }*/
	
	
	// swap() doesn't swap i and j
	   public static void swap(int i, int j) 
	   {
	      int temp = i;
	      i = j;
	      j = temp;
	   }
	   public static void main(String[] args) 
	   {
//	      Integer i = new Integer(10);
//	      Integer j = new Integer(20);
	      int i = 10;
	      int j = 20;
	      swap(i, j);
	      //System.out.println("i = " + i + ", j = " + j);
	      
	      int f = 1;
	      
	      switch (f) {
		case 1:
			System.out.println("AAA");
			break;
		case 'B':
			System.out.println("BBB");
			break;

		default:
			System.out.println("default");
			break;
		}
	   }
}

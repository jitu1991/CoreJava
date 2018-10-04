package com.test.misc;

/*class BC 
{
	int version = 23;

	BC() 
	{
		getVersion();
		
	}

	public int getVersion() 
	{
		System.out.println("BC version is" + version);
		return 0;
	}

}*/
class AA //extends BC 
{
	int version = 23;
	AA() 
	{
		System.out.println(this.getClass().getName());
		System.out.println("before AA()");
		System.out.println("Call " + getVersion()) ;
		System.out.println("after AA()");
		
	}
	public int getVersion() 
	{
		System.out.println("AA version is" + version);
		return 0;
	}
}

class BB extends AA 
{
	int version = 43;

	BB() 
	{
		super();
	}
	
	
	public int getVersion() 
	{
		System.out.println("BB version is" + version);
		return 0;
	}
}

public class ChainingTest 
{
	public static void main(String[] args) 
	{
		 BB ref = new BB();
	}
}

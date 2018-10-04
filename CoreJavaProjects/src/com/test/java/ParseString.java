package com.test.java;

public class ParseString {
	static String str = "+TPName1,+DELETE,+dGVzdGNsZWFydmFsdWVzdHJpbmc=,+#2#1;";
	static char[] charArray = str.toCharArray();
	static int lastIndex = charArray.length - 1;

	static int myBeginningOfCSVData = 0;
	static int myOffsetInCSVData = 0;
	static int myEndOfCSVData = lastIndex;
	static int myBeginningOfCurrentValue = 0;
	static int myEndOfCurrentValue = lastIndex;

	static boolean myCanGetCurrentValue = false;
	static boolean myHasValue = false;
	static boolean containMultipleValue = false;

	static int myIndexOfCurrentRow = 0;
	static int myIndexOfCurrentColumn = 0;
	
	static void onValue() {
		if(containMultipleValue)
		{
			str = getCurrentValue();
			String[] strArray = str.split("#");
			
			for (String s : strArray)
            {
                System.out.println(s);
            }
			containMultipleValue = false;
		}
		else
		{
			System.out.println(str.substring(myBeginningOfCurrentValue, myEndOfCurrentValue));
		}
	}
	
	static String getCurrentValue() {
		return str.substring(myBeginningOfCurrentValue, myEndOfCurrentValue);
	}

	public static void main(String[] args) {
		//static String str = "+AZ,+B,+C,+#1#2;+X,+Y,+Z;";
		
		String str = null;
		
		System.out.println(("abc").equals(str));
		System.out.println((str).equals("abc"));

		String ext = "";

		myBeginningOfCurrentValue = myOffsetInCSVData;
		myEndOfCurrentValue = myEndOfCSVData;
		while (myOffsetInCSVData != myEndOfCSVData)
		{
			if (charArray[myOffsetInCSVData] == ';')
			{
				myEndOfCurrentValue = myOffsetInCSVData;
				break;
			}

			if (charArray[myOffsetInCSVData] == ',')
			{
				myCanGetCurrentValue = true;
				myEndOfCurrentValue = myOffsetInCSVData;

				// trimCurrentValue();

				if (charArray[myBeginningOfCurrentValue] == '+')
				{
					++myBeginningOfCurrentValue;
					myHasValue = true;
					if (charArray[myBeginningOfCurrentValue] == '#')
                    {
						++myBeginningOfCurrentValue;
                        myHasValue = true;
                        containMultipleValue = true;
                    }
				}
				else if (charArray[myBeginningOfCurrentValue] == '-')
				{
					++myBeginningOfCurrentValue;
					if (myBeginningOfCurrentValue < myEndOfCurrentValue)
					{
						myHasValue = true;
						--myBeginningOfCurrentValue;
					}
					else
					{
						myHasValue = false;
					}
				}
				else
				{
					myHasValue = (myBeginningOfCurrentValue < myEndOfCurrentValue);
				}

				onValue();
				/*for (int i = myBeginningOfCurrentValue; i < myEndOfCurrentValue; i++)
				{
					System.out.print(charArray[i]);
				}
				System.out.println("=====");*/

				myCanGetCurrentValue = false;
				myBeginningOfCurrentValue = myOffsetInCSVData;
				myEndOfCurrentValue = myEndOfCSVData;
				++myBeginningOfCurrentValue;
				++myIndexOfCurrentColumn;
			}

			++myOffsetInCSVData;
		}

		if (myBeginningOfCurrentValue < myEndOfCurrentValue) {
			myCanGetCurrentValue = true;

			// trimCurrentValue();

			if (charArray[myBeginningOfCurrentValue] == '+') {
				++myBeginningOfCurrentValue;
				myHasValue = true;
				if (charArray[myBeginningOfCurrentValue] == '#')
                {
					++myBeginningOfCurrentValue;
                    myHasValue = true;
                    containMultipleValue = true;
                }
			} else if (charArray[myBeginningOfCurrentValue] == '-') {
				++myBeginningOfCurrentValue;
				if (myBeginningOfCurrentValue < myEndOfCurrentValue) {
					--myBeginningOfCurrentValue;
					myHasValue = true;
				} else {
					myHasValue = false;
				}
			} else {
				myHasValue = (myBeginningOfCurrentValue < myEndOfCurrentValue);
			}

			onValue();

			myCanGetCurrentValue = false;
		} else {
			myCanGetCurrentValue = false;
			myHasValue = false;

			onValue();
		}

		/*
		 * myBeginningOfCurrentValue = myOffsetInCSVData; myEndOfCurrentValue =
		 * myEndOfCSVData; while(myOffsetInCSVData != myEndOfCSVData) {
		 * if(charArray[myOffsetInCSVData] == ';') { myEndOfCurrentValue =
		 * myOffsetInCSVData; break; }
		 * 
		 * if(charArray[myOffsetInCSVData] == ',') { myCanGetCurrentValue =
		 * true; myEndOfCurrentValue = myOffsetInCSVData;
		 * 
		 * //trimCurrentValue();
		 * 
		 * if(charArray[myBeginningOfCurrentValue] == '+') {
		 * if(charArray[++myBeginningOfCurrentValue] != '#') { myHasValue =
		 * true; } else { /////////////////// For New Delimeter #
		 * ////////////////// myCanGetCurrentValue = true; myEndOfCurrentValue =
		 * myOffsetInCSVData; //trimCurrentValue();
		 * if(charArray[myBeginningOfCurrentValue] == '#') {
		 * ++myBeginningOfCurrentValue; myHasValue = true; } else { myHasValue =
		 * (myBeginningOfCurrentValue < myEndOfCurrentValue); }
		 * 
		 * for(int i = myBeginningOfCurrentValue; i<myEndOfCurrentValue;i++) {
		 * System.out.print(charArray[i]); } System.out.println("####");
		 * 
		 * myCanGetCurrentValue = false; myBeginningOfCurrentValue =
		 * myOffsetInCSVData; myEndOfCurrentValue = myEndOfCSVData;
		 * ++myBeginningOfCurrentValue; ++myIndexOfCurrentColumn;
		 * ///////////////////////////////////////////////// } } else
		 * if(charArray[myBeginningOfCurrentValue] == '-') {
		 * ++myBeginningOfCurrentValue; if(myBeginningOfCurrentValue <
		 * myEndOfCurrentValue) { myHasValue = true;
		 * --myBeginningOfCurrentValue; } else { myHasValue = false; } } else {
		 * myHasValue = (myBeginningOfCurrentValue < myEndOfCurrentValue); }
		 * 
		 * for(int i = myBeginningOfCurrentValue; i<myEndOfCurrentValue;i++) {
		 * System.out.print(charArray[i]); } System.out.println("=====");
		 * 
		 * myCanGetCurrentValue = false; myBeginningOfCurrentValue =
		 * myOffsetInCSVData; myEndOfCurrentValue = myEndOfCSVData;
		 * ++myBeginningOfCurrentValue; ++myIndexOfCurrentColumn; }
		 * 
		 * ++myOffsetInCSVData; }
		 * 
		 * if(myBeginningOfCurrentValue < myEndOfCurrentValue) {
		 * myCanGetCurrentValue = true;
		 * 
		 * //trimCurrentValue();
		 * 
		 * if(charArray[myBeginningOfCurrentValue] == '+') {
		 * if(charArray[++myBeginningOfCurrentValue] != '#') { myHasValue =
		 * true; } else { /////////////////// For New Delimeter #
		 * ////////////////// myCanGetCurrentValue = true; myEndOfCurrentValue =
		 * myOffsetInCSVData; //trimCurrentValue();
		 * if(charArray[myBeginningOfCurrentValue] == '#') {
		 * ++myBeginningOfCurrentValue; myHasValue = true; } else { myHasValue =
		 * (myBeginningOfCurrentValue < myEndOfCurrentValue); }
		 * 
		 * for(int i = myBeginningOfCurrentValue; i<myEndOfCurrentValue;i++) {
		 * System.out.print(charArray[i]); } System.out.println("####");
		 * 
		 * myCanGetCurrentValue = false; myBeginningOfCurrentValue =
		 * myOffsetInCSVData; myEndOfCurrentValue = myEndOfCSVData;
		 * ++myBeginningOfCurrentValue; ++myIndexOfCurrentColumn;
		 * ///////////////////////////////////////////////// } } else
		 * if(charArray[myBeginningOfCurrentValue] == '-') {
		 * ++myBeginningOfCurrentValue; if(myBeginningOfCurrentValue <
		 * myEndOfCurrentValue) { --myBeginningOfCurrentValue; myHasValue =
		 * true; } else { myHasValue = false; } } else { myHasValue =
		 * (myBeginningOfCurrentValue < myEndOfCurrentValue); }
		 * 
		 * for(int i = myBeginningOfCurrentValue; i<myEndOfCurrentValue;i++) {
		 * System.out.print(charArray[i]); } System.out.println("=====");
		 * 
		 * myCanGetCurrentValue = false; } else { myCanGetCurrentValue = false;
		 * myHasValue = false;
		 * 
		 * for(int i = myBeginningOfCurrentValue; i<myEndOfCurrentValue;i++) {
		 * System.out.print(charArray[i]); } System.out.println("====="); }
		 */
	}
}

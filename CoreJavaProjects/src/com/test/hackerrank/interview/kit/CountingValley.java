package com.test.hackerrank.interview.kit;

public class CountingValley {
	public static void main(String[] args) {
		String steps = "DUDU";//UDDDUDUU";
		System.out.println(countingValleys(12, steps));
	}
	
	static int countingValleys(int n, String s) {
        /*char[] charArray = s.toCharArray();
        int valleyCount = 0;
        int seaLevel = 0;
        boolean isValley = false;
            for(int i = 0; i < n; i++) {
            if(charArray[i] == 'D') {
                seaLevel = seaLevel - 1;
            } else {
                seaLevel = seaLevel + 1;
            }
            if(seaLevel < 0) {
                isValley = true;
            } else if(seaLevel > 0) {
                isValley = false;
            }
            if(isValley && seaLevel == 0) {
                valleyCount++;
            }
        }
        return valleyCount;*/
		
		int v = 0;     // # of valleys
        int lvl = 0;   // current level
        for(char c : s.toCharArray()){
            if(c == 'U') ++lvl;
            if(c == 'D') --lvl;
            
            // if we just came UP to sea level
            if(lvl == 0 && c == 'U')
                ++v;
        }
        return v;
    }
}

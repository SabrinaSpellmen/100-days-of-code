package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class codechallenge1 {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
    	long count =0;
    	int numberOfA = 0;
    	char [] chArray = s.toCharArray();
    	String singleChar = "";
    	for (int i = 0; i < chArray.length; i++) {
    		singleChar = chArray[i]+"";
    		if (singleChar.equals("a")) {
    			numberOfA++;
    		}	
		}
    	System.out.println("number of A"+numberOfA);
    	long m = (n/(s.length()))*numberOfA;
    	long mod = (n%(s.length()));
    	System.out.println("m============ "+m);
		System.out.println("mod============ "+mod);
    	for (int i = 0; i < mod; i++) {
    		singleChar = chArray[i]+"";
    		if (singleChar.equals("a")) {
    			count++;
    		}
		}
    	System.out.println("count ___________"+count+m);
    	return count+m;
    }

}



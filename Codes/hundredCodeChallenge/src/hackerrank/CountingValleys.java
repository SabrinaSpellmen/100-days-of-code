package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class CountingValleys {

	


	    /*
	     * Complete the 'countingValleys' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts following parameters:
	     *  1. INTEGER steps
	     *  2. STRING path
	     */

	    public static int countingValleys(int steps, String path) {
	    // Write your code here
	    	int valleyCount =0;
	    	char [] pathArray = path.toCharArray();
	    	String oneStep = "";
	    	int count=0;
	    	for (int i = 0; i < pathArray.length; i++) {
				if(pathArray[i]=='D') {
					count++;
				}
				else
					count--;
				if (count==0 && pathArray[i]=='U') {
					valleyCount++;
				}
			}
	    	System.out.println(valleyCount);
	    	return valleyCount;
	    }

	}

	


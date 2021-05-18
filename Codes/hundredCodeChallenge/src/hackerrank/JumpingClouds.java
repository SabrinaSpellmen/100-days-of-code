package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class JumpingClouds {

	

	    /*
	     * Complete the 'jumpingOnClouds' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts INTEGER_ARRAY c as parameter.
	     */

	    public static int jumpingOnClouds(List<Integer> c) {
	    // Write your code here
	    	int steps = 0;
	    	int count =0;
	    	for (int i = 0; i < c.size(); i++) {
				steps++;
				count = count+2;
				if(count<c.size() && c.get(count)!=1) {
					i= count;
					continue;
				}
				else {
					count--;
					i=count;
				}
				if (count == c.size()) {
					return steps;
				}
			}
	    	
	    	return steps;

	    }

	}



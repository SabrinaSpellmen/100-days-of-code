package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Alternating_Characters {


	    /*
	     * Complete the 'alternatingCharacters' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts STRING s as parameter.
	     */

	    public static int alternatingCharacters(String s) {
	    // Write your code here
	    	int count =0;
	    	char current;
	    	char next;
	    	
	    	for (int i = 0; i < s.length()-1; i++) {
	    	
	    		if(s.charAt(i) ==  s.charAt(i+1)) {
	    			count++;
	    		}
				
			}
	    	return count;
	    }

	}

	
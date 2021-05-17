package hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import hackerrank.CountingValleys;

public class CountingValleys_1 {

	
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int steps = Integer.parseInt(bufferedReader.readLine().trim());

	        String path = bufferedReader.readLine();

	        int result = CountingValleys.countingValleys(steps, path);

	        //bufferedWriter.write(String.valueOf(result));
	        //bufferedWriter.newLine();

	        bufferedReader.close();
	        //bufferedWriter.close();
	    }
	}


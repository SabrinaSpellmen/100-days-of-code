package hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import javax.sound.midi.Soundbank;

public class Sales_by_match {

	



	
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        List<Integer> ar = new ArrayList<>();

	        for (int i = 0; i < n; i++) {
	            int arItem = Integer.parseInt(arTemp[i]);
	            ar.add(arItem);
	        }

	        int result = Sales_by_match1.sockMerchant(n, ar);
	        System.out.println(result);
	        //bufferedWriter.write(String.valueOf(result));
	        //bufferedWriter.newLine();

	        bufferedReader.close();
	        //bufferedWriter.close();
	    }
	}

	
	


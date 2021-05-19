package hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alternating_Characters1 {

	
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int q = Integer.parseInt(bufferedReader.readLine().trim());

	        for (int qItr = 0; qItr < q; qItr++) {
	            String s = bufferedReader.readLine();

	            int result = Alternating_Characters.alternatingCharacters(s);
	            System.out.println(result);
	            //bufferedWriter.write(String.valueOf(result));
	            //bufferedWriter.newLine();
	        }

	        bufferedReader.close();
	       // bufferedWriter.close();
	    }
	}

	

	


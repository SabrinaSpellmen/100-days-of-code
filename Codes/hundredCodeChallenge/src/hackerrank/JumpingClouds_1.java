package hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class JumpingClouds_1 {

	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        String[] cTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        List<Integer> c = new ArrayList<>();

	        for (int i = 0; i < n; i++) {
	            int cItem = Integer.parseInt(cTemp[i]);
	            c.add(cItem);
	        }

	        int result = JumpingClouds.jumpingOnClouds(c);
	        System.out.println(result);
	        //bufferedWriter.write(String.valueOf(result));
	        //bufferedWriter.newLine();

	        bufferedReader.close();
	        //bufferedWriter.close();
	    }
	}

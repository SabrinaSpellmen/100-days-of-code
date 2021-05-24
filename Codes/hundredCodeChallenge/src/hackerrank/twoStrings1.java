package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class twoStrings1 {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = bufferedReader.readLine();

            String s2 = bufferedReader.readLine();

            String result = twoStrings.twoStrings(s1, s2);
            System.out.println(result);
            //bufferedWriter.write(result);
            //bufferedWriter.newLine();
        }

        bufferedReader.close();
        //bufferedWriter.close();
    }

	
}

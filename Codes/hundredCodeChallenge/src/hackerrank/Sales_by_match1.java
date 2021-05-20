package hackerrank;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sales_by_match1 {

	static int repeated = 0;
	    /*
	     * Complete the 'sockMerchant' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts following parameters:
	     *  1. INTEGER n
	     *  2. INTEGER_ARRAY ar
	     */

	    public static int sockMerchant(int n, List<Integer> c) {
	        Set<Integer> colors = new HashSet<>();
	        int pairs = 0;

	        for (int i = 0; i < n; i++) {
	            if (!colors.contains(c.get(i))) {
	                colors.add(c.get(i));
	            } else {
	                pairs++;
	                colors.remove(c.get(i));
	            }
	        }

	        System.out.println(pairs);
			return pairs;}

	}


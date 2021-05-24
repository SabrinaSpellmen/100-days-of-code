package hackerrank;

public class twoStrings {


	    public static String twoStrings(String s1, String s2) {
	    // Write your code here
	    	char [] as1 = s1.toCharArray();
	    	char [] as2 = s2.toCharArray();
	    	char [] biggerArray = as2.length < as1.length ? as2  : as1;
	    	int j=0;
	    	int t = 0;
	    	
	    	for (int i = 0; i <biggerArray.length; i++) {
	    		for (int k = 0; k < biggerArray.length; k++) {
					
				
				if(as1[i]==as2[k]) {
					System.out.println("YES");
					
					return "YES";
				}
				
	    		}
				
			}
	    	
	    	return "NO";
	    }

	}

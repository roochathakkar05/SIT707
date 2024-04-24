package sit707_week6;

public class MyOwnSourceCode {
	 public static int AddUpTo(int x) 
	 {
		 	int sum = 0;
	        for (int i = 0; i <= x; i++) {
	            sum=sum+i;
	        }
	        return sum;
	 }
	 public static int NumberOfOddNumUpTo(int n) 
	 {
		 	int NumofOdd=0;
	        for (int i = 0; i <= n; i++) {
	            if (i % 2 != 0) {
	                NumofOdd++;
	            }
	        }
	        return NumofOdd;
	}
}

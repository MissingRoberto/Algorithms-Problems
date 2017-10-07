package searchnsort;

public class PowerSum {

	public static int powerSum(int[] sums, int i, int N ){
		if (i < 1){
			return 0;
		}
		
		if (sums[i] != 0 ){
			return sums[i];
		}
		
		sums[i] = (int)Math.pow(i, N) + powerSum(sums,i-1, N);
		
		return sums[i];	  
	}
	
	public static int powerSumCount(int sums[], int X, int N) {
		System.out.println("Sum: " + X + " ,Power: " + N);
		if (X < 1)
			return 0;
	

		int biggest = (int) Math.pow(X, (double) 1 / N);
		int combinations = 0;
		
		while (biggest > 0 ) {		
			int powerBiggest = (int) Math.pow(biggest, N);
			int rest = X - powerBiggest;
			if (rest == 0) {
				combinations++;
			}else if (powerSum(sums, biggest, N) <= X){
				break;
		    }else{
				combinations += powerSumCount(sums,rest, N);
			}
			
			biggest--;
		
		}

		System.out.println("Sum: " + X + " ,Power" + N + " Combinations: " + combinations);

		return combinations;
	}
}

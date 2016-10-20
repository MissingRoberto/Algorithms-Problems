package arraysnstrings;

public class MatrixSpinal {
	
	
	private static boolean isOutOfBounds(int r, int l, int t, int b){
		return !(r <= l) || !(b<=t);
	}
	
	public static void printSpinal(int[][] matrix) {

		int top = matrix.length-1;
		int right = 0;
		int left = matrix[0].length-1;
		int bottom = 0;
	
		while (true) {
			
			if (isOutOfBounds(right,left,top,bottom))
				return;
			
//			System.out.println("Go to the right");
			for(int i=right; i <= left; i++){
				System.out.println(matrix[bottom][i]);
			}
			
			if (isOutOfBounds(right,left,top,bottom))
				return;
			bottom++;
			
//			System.out.println("Go to the bottom");
			for(int i=bottom; i <= top; i++){
				System.out.println(matrix[i][left]);
			}
			
			if (isOutOfBounds(right,left,top,bottom))
				return;
			
			left--; 
			
//			System.out.println("Go to the left");
			for(int i=left; i >= right; i--){
				System.out.println(matrix[top][i]);
			}
			top--;
			
			if (isOutOfBounds(right,left,top,bottom))
				return;
			
//			System.out.println("Go to the top");
			for(int i=top; i >= bottom; i--){
				System.out.println(matrix[i][right]);
			}
			
			right++;
			
		}

	}
}

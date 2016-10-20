package arraysnstrings;

public class SearchSortedMatrix {
	
	private static boolean couldBeThere(int[] row, int value){
	    if (row.length == 0)
	        return false;
	    return value >= row[0] && value <= row[row.length-1];
	}

	private static int searchRow(int[][] matrix, int value ){

	    int left = 0;
	    int right = matrix.length;
	    while(left <= right){
	        int mid = (right + left)/2;
	        if (couldBeThere(matrix[mid],value)){
	            return mid;
	        }
	        if (value > matrix[mid][0]){
	            left = mid + 1;
	        }else{
	            right = mid - 1;
	        }
	    }

	    return -1;

	}


	private static int searchValue(int[] row, int value ){

	    int left = 0;
	    int right = row.length;
	    while(left <= right){
	        int mid = (right + left)/2;
	        if (row[mid] == value){
	            return mid;
	        }
	        if (value > row[mid]){
	            left = mid + 1;
	        }else{
	            right = mid - 1;
	        }
	    }
	    return -1;
	}
	
	public static boolean search(int[][] matrix, int value ){

	    int rowIndex = searchRow(matrix,value);
	    if (rowIndex < 0){
	        return false;
	    }
	    return searchValue(matrix[rowIndex],value) >= 0;

	}

}

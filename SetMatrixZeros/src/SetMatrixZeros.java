import java.util.*;
public class SetMatrixZeros {
	public static void main(String[] args) {
		int[][] matrix = {
                            {1, 1, 1, 1},
                            {1, 0, 0, 1},
                            {1, 1, 0, 1},
                            {1, 1, 1, 1}
                        };
		int n= matrix.length;
        int m= matrix[0].length;
        setMatrixZeros(matrix,n,m);
        //print the result
        for(int[] row:matrix){
            System.out.println(Arrays.toString(row));
        }
	}
	
	public static void setMatrixZeros(int[][] matrix,int n,int m){
	    // Step 1: Mark rows and columns
	    for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
	            if(matrix[i][j]==0){
	                markRow(matrix,m,i);
	                markCol(matrix,n,j);
	            }
	        }
	    }
	   // Step 2: Convert -1 to 0
	   for(int i=0;i<n;i++){
	       for(int j=0;j<m;j++){
	           if(matrix[i][j]==-1){
	               matrix[i][j]=0;
	           }
	       }
	   }
	}
	public static void markRow(int[][] matrix,int m,int i){
	    for(int j=0;j<m;j++){
	        if(matrix[i][j]!=0){
	            matrix[i][j]=-1;
	        }
	    }
	   }
	   public static void markCol(int[][] matrix,int n,int j){
	       for(int i=0;i<n;i++){
	           if(matrix[i][j]!=0){
	               matrix[i][j]=-1;
	           }
	       }
	   }

}

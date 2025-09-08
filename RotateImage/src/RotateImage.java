import java.util.*;
public class RotateImage {
	public static void main(String[] args) {
		int[][] matrix = {
                            {1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}
                        };
        //Square matrix n*n
        int n=matrix.length;
        int[][] result=rotateMatrix(matrix,n);
        //print the result
        for(int[] row:result){
            System.out.println(Arrays.toString(row));
        }
	}
	
	//1.Brute Level
	public static int[][] rotateMatrix(int[][] matrix,int n){
	    int[][] ans=new int[n][n];
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            ans[j][(n-1)-i]=matrix[i][j];
	        }
	    }
	    // Copy ans back to matrix, Copies: 13, 9, 5, 1 -> replaces matrix[0]
	    /*for(int i=0;i<n;i++){
	        System.arraycopy(ans[i],0,matrix[i],0,n);
	    }*/
	    return ans;
	}

}

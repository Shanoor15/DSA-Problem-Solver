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
        rotateMatrix(matrix,n);
        //print the result
        for(int[] row:matrix){
            System.out.println(Arrays.toString(row));
        }
	}
	
	//1.Brute Level
	/*public static int[][] rotateMatrix(int[][] matrix,int n){
	    int[][] ans=new int[n][n];
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            ans[j][(n-1)-i]=matrix[i][j];
	        }
	    }
	    // Copy ans back to matrix, Copies: 13, 9, 5, 1 -> replaces matrix[0]
	   // for(int i=0;i<n;i++){
	   //     System.arraycopy(ans[i],0,matrix[i],0,n);
	   // }
	    return ans;
	}*/
	
	//2.Optimal Level
	public static void rotateMatrix(int[][] matrix,int n){
	    // 1. Transpose i.e row become col and wisever
	    for(int i=0;i<n-2;i++){
	        for(int j=i+1;j<n;j++){
	            /*int temp=matrix[i][j];
	            matrix[i][j]=matrix[j][i];
	            matrix[j][i]=temp;*/
	            swap(matrix,i,j,j,i);
	        }
	    }
	    // 2. Reverse each row using two-pointer technique
	    for(int i=0;i<n;i++){
	        int left=0,right=n-1;
	        while(left<right){
	            /*int temp=matrix[i][left];
	            matrix[i][left]=matrix[i][right];
	            matrix[i][right]=temp;*/
	            swap(matrix,i,left,i,right);
	            left++;
	            right--;
	        }
	    }
	}
	// Helper method defined outside of rotateMatrix
	public static void swap(int[][] matrix,int i1,int j1,int j2,int i2){
	        int temp=matrix[i1][j1];
	            matrix[i1][j1]=matrix[j2][i2];
	            matrix[j2][i2]=temp;
	    }
}

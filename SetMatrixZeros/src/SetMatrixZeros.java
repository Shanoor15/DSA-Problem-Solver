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
	
	//1.Brute Level
	/*public static void setMatrixZeros(int[][] matrix,int n,int m){
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
	   }*/
	   
	//2.Better Level
	/*public static void setMatrixZeros(int[][] matrix,int n,int m){
	    int[] row=new int[n];
	    int[] col=new int[m];
	    for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
	            if(matrix[i][j]==0){
	                row[i]=1;
	                col[j]=1;
	            }
	        }
	    }
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            if(row[i]==1 || col[j]==1){
	                matrix[i][j]=0;
	            }
	        }
	    }
	}*/
	
	//3.Optimal Level
	public static void setMatrixZeros(int[][] matrix,int n,int m){
	    int col=1;
	    for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
	            if(matrix[i][j]==0){
	                matrix[i][0]=0;
	                if(j!=0)
	                    matrix[0][j]=0;
	                else
	                    col=0;
	            }
	        }
	    }
	    for(int i=1;i<n;i++){
	        for(int j=1;j<m;j++){
	            if(matrix[i][j]!=0){
	                //check for col & row
	                if(matrix[0][j]==0 || matrix[i][0]==0){
	                    matrix[i][j]=0;
	                }
	            }
	        }
	    }
	    if(matrix[0][0]==0){
	        for(int j=0;j<m;j++)
	            matrix[0][j]=0;
	    }
	    if(col==0){
	        for(int i=0;i<n;i++){
	            matrix[i][0]=0;
	        }
	    }
	}
}

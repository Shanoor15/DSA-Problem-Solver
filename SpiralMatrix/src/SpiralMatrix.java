import java.util.*;
public class SpiralMatrix {
	public static void main(String[] args) {
		int[][] matrix={
                { 1,  2,  3,  4},
                {12, 13, 14,  5},
                {11, 16, 15,  6},
                {10,  9,  8,  7}
		    };
		ArrayList<Integer> result=spiralMatrix(matrix);
		for(int ans:result){
		    System.out.print(ans+" ");
		}
	}
	public static ArrayList<Integer> spiralMatrix(int[][] matrix){
	    ArrayList<Integer> list=new ArrayList<>();
	    int n=matrix.length;
	    int m=matrix[0].length;
	    int left=0,right=m-1,top=0,bott=n-1;
	    while(left<=right && top<=bott){
	    //1.right
	    for(int i=left;i<=right;i++){
	        list.add(matrix[top][i]);
	    }
	    top++;
	    //2.bottom
	    for(int i=top;i<=bott;i++){
	        list.add(matrix[i][right]);
	    }
	    right--;
	    //3.left
	    if(top<=bott){
	        for(int i=right;i>=left;i--){
	            list.add(matrix[bott][i]);
	        }
	    bott--;
	    }
	    //4.top
	    if(left<=right){
	    for(int i=bott;i>=top;i--){
	        list.add(matrix[i][left]);
	    }
	    left++;
	    }
	  }
	    return list;
	}

}

import java.util.*;
public class GeneratePascalTriangle {
	public static void main(String[] args) {
		int n=6;
		List<List<Integer>> result=pascalTriangle(n);
		for(List<Integer> num:result){
		    System.out.println(num);
		}
	}
	//1.Brute Level  TC-->O(N*N*N)=>O(N^3)
	/*public static List<List<Integer>> pascalTriangle(int n){
	    List<List<Integer>> triangle=new ArrayList<>();
	    for(int row=0;row<n;row++){
	        List<Integer> currentRow=new ArrayList<>();
	        for(int col=0;col<=row;col++){
	            currentRow.add(funNCR(row,col));
	        }
	        triangle.add(currentRow);
	    }
	    return triangle;
	}
	public static int funNCR(int row,int col){
	    int res=1;
	    for(int i=0;i<col;i++){
	        res=res*(row-i);
	        res=res/(i+1);
	    }
	    return res;
	}*/
	
	public static List<List<Integer>> pascalTriangle(int n){
	    List<List<Integer>> triangle=new ArrayList<>();
	    for(int row=1;row<=n;row++){
	        List<Integer> currentRow=new ArrayList<>();
	        int ans=1;
	        currentRow.add(1);
	        for(int col=1;col<row;col++){
	            ans=ans*(row-col)/col;
	            currentRow.add(ans);
	        }
	        triangle.add(currentRow);
	    }
	    return triangle;
	}

}

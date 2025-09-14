import java.util.*;
public class PascalTrianglePickOneRow {
	public static void main(String[] args) {
		int[][] arr = {
            {1},
            {1, 1},
            {1, 2, 1},
            {1, 3, 3, 1},
            {1, 4, 6, 4, 1},
            {1, 5, 10, 10, 5, 1},
            {1, 6, 15, 20, 15, 6, 1}
        };
		int r=7;
		int[] result=funRow(r);
		System.out.println(Arrays.toString(result));
	}
	public static int[] funRow(int r){
	    int[] ans=new int[r];
	    int ind=0;
	    for(int c=1;c<=r;c++){
	        ans[ind++]=funNCR(r-1,c-1);
	    }
	    return ans;
	}
	public static int funNCR(int r,int ele){
	    int res=1;
	    for(int i=0;i<ele;i++){
	        res=res*(r-i);
	        res=res/(i+1);
	    }
	    return res;
	}

}

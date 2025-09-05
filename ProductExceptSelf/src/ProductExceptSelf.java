import java.util.*;
public class ProductExceptSelf {
	public static void main(String[] args) {
		int[] arr={1,2,3,4};
		int n=arr.length;
		int[] result=productExceptSelf(arr,n);
		System.out.println(Arrays.toString(result));
	}
	//1.Brute Level
	/*public static int[] productExceptSelf(int[] arr,int n){
	    int[] result=new int[n];
	    for(int i=0;i<n;i++){
	        int mult=1;
	        for(int j=0;j<n;j++){
	            if(i!=j){
	                mult*=arr[j];
	            }
	        }
	        result[i]=mult;
	    }
	    return result;
	}*/
	
	//2.Better Level
	/*public static int[] productExceptSelf(int[] arr,int n){
	    int[] prif=new int[n];
	    prif[0]=1;
	    int[] sufi=new int[n];
	    sufi[n-1]=1;
	    int[] result=new int[n];
	    for(int i=1;i<n;i++){
	        prif[i]=prif[i-1]*arr[i-1];
	    }
	    for(int i=n-2;i>=0;i--){
	        sufi[i]=sufi[i+1]*arr[i+1];
	    }
	    for(int i=0;i<n;i++){
	        result[i]=prif[i]*sufi[i];
	    }
	    return result;
	}*/
	
	//3.Optimal Level
	public static int[] productExceptSelf(int[] arr,int n){
	    int[] ans=new int[n];
	    ans[0]=1;
	    int prifix=1;
	    for(int i=1;i<n;i++){
	        prifix*=arr[i-1];
	        ans[i]=prifix;
	    }
	    int sufix=1;
	    for(int i=n-2;i>=0;i--){
	        sufix*=arr[i+1];
	        ans[i]=sufix*ans[i];
	    }
	    return ans;
	}

}

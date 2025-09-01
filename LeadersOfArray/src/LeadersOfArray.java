import java.util.*;
public class LeadersOfArray {
	public static void main(String[] args) {
	    int[] arr={10,22,12,3,0,6};
	    int n=arr.length;
	    int[] res=leadersOfArray(arr,n);
	    System.out.println(Arrays.toString(res));
	}
	//1.Brute Level
	/*public static int[] leadersOfArray(int[] arr,int n){
	    int[] ans=new int[n];
	    int ind=0;
	    for(int i=0;i<n;i++){
	        boolean flag=true;
	        for(int j=i+1;j<n;j++){
	            if(arr[j]>arr[i]){
	                flag=false;
	                break;
	            }
	        }
	        if(flag){
	                ans[ind++]=arr[i];
	            }
	    }
	    return Arrays.copyOf(ans,ind);
	}*/
	
	//2.Optimal Level
	public static int[] leadersOfArray(int[] arr,int n){
	    int[] ans=new int[n];
	    int max=Integer.MIN_VALUE;
	    int ind=0;
	    // Traverse from right to left
	    for(int i=n-1;i>=0;i--){
	        if(arr[i]>max){
	            ans[ind++]=arr[i];
	            max=arr[i];
	        }
	    }
	     // Trim the array to valid length
	    int[] result=Arrays.copyOf(ans,ind);
	    // Reverse result to maintain original left-to-right order
	    int start=0,end=ind-1;
	    while(start<end){
	        int temp=result[start];
	        result[start]=result[end];
	        result[end]=temp;
	        start++;
	        end--;
	    }
	    return result;
	}

}

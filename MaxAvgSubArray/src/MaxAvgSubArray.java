import java.util.*;
public class MaxAvgSubArray {
	public static void main(String[] args) {
		int[] arr={1,12,-5,-6,50,3};
		int k=4;
		/*int[] arr={5};
		int k=1;*/
		int result=maxAvgSubArray(arr,k);
		System.out.println(result);
	}
	//Brute Level
	/*public static int maxAvgSubArray(int[] arr,int k){
	    int n=arr.length;
	    int max=Integer.MIN_VALUE;
	    for(int i=0;i<=n-k;i++){
	        int sum=0;
	        for(int j=i;j<i+k;j++){
	                sum+=arr[j];
	            }
	            max=Math.max(sum,max);
	        }
	    return max/k;
	}*/
	
	//2.Optimal Level
	public static int maxAvgSubArray(int[] arr,int k){
	    int sum=0,n=arr.length;
	    for(int i=0;i<k;i++){
	        sum+=arr[i];
	    }
	    int maxSum=sum;
	    for(int right=k;right<n;right++){
	        sum+=arr[right]-arr[right-k]; // remove leftmost, add new right
	        maxSum=Math.max(maxSum,sum);
	    }
	    return maxSum/k;
	}

}

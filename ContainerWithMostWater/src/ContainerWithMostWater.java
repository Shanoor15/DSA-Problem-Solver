import java.util.*;
public class ContainerWithMostWater {
	public static void main(String[] args) {
		int[] arr={1,8,6,2,5,4,8,3,7};
		int n=arr.length;
		int result=maxWaterStore(arr,n);
		System.out.println(result);
	}
	//1.Brute Level
	/*public static int maxWaterStore(int[] arr,int n){
	    int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
	    for(int i=0;i<n;i++){
	        if(arr[i]>max1){
	            max1=arr[i];
	        }
	    }
	    for(int i=0;i<n;i++){
	        if(arr[i]>max2 && arr[i]<max1){
	            max2=arr[i];
	        }
	    }
	    return max1+max2;
	}*/
	
	//2.Optimal Level
	public static int maxWaterStore(int[] arr,int n){
	    int max=Integer.MIN_VALUE;
	    int l=0,r=n-1;
	    while(l<r){
	        int water=Math.min(arr[l],arr[r])*(r-l);
	        max=Math.max(max,water);
	        if(arr[l]<arr[r]){
	            l++;
	        }else{
	            r--;
	        }
	    }
	    return max;
	}
}

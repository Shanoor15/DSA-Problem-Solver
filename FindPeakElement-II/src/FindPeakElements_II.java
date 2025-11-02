////If array Contain more than one peak

import java.util.ArrayList;
import java.util.List;

public class FindPeakElements_II {

	public static void main(String[] args) {
		int[] arr= {1,4,3,8,5};
		int res=findPeak(arr);
		System.out.println(res);
	}
	
	//1.Better Level
	/*public static int findPeak(int[] arr) {
	int max=Integer.MIN_VALUE;
	int ind=0;
	for(int i=0;i<arr.length;i++){
	    if(arr[i]>max){
	        max=arr[i];
	        ind=i;
	    }
	}
	return ind;
	}*/
	
	/*public static int findPeak(int[] arr) {
		int n=arr.length;
	    for(int i=0;i<n;i++){
	        if((i==0||arr[i-1]<arr[i]) && (i==n-1||arr[i]>arr[i+1]))
	        	return i;
	    }
	    return 0;
	}*/
	
	/*public static int findPeak(int[] arr) {
		int n=arr.length;
		if(arr[0]>arr[1]) return 0;
		if(arr[n-2]<arr[n-1]) return n-1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]<arr[i] && arr[i]>arr[i+1]) {
				return i;
			}
		}
		return 0;
	}*/
	
	//2.Optimal Level
	public static int findPeak(int[] arr){
		List<Integer> list=new ArrayList<>();
		int n=arr.length;
	    int low=1,high=n-2;
	    while(low<=high) {
	    	int mid=(low+high)/2;
	    	if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1])
	    		return mid;
	    	if(arr[mid-1]<arr[mid])
	    		low=mid+1;
	    	else if(arr[mid]>arr[mid+1])
	    		high=mid-1;
	    	else
	    		low=mid+1;
	    }
	    return -1;
	}

}

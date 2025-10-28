import java.util.*;
public class FindMinimumInRotatedSortedArray {
	public static void main(String[] args) {
		//int[] arr={4,5,6,7,0,1,2};
		//int[] arr={1,2,3,4,5};
		int[] arr={3,1,2};
		//int[] arr= {4,5,6,7,0,1,2};
		int res=minEleRotateArr(arr);
		System.out.println(res);
	}
	/*public static int minEleRotateArr(int[] arr){
		int min=Integer.MAX_VALUE;
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]>arr[i+1]) {
				min=arr[i+1];
			}
		}
		return min;
	}*/
	
	//1.Better Level
	/*public static int minEleRotateArr(int[] arr){
	    int left=arr.length-1;
	    while(left>=0){
	        if(left==0)
	            return arr[left];
	        if(arr[left]>arr[left-1]){
	            left--;
	        }else{
	            return arr[left];
	        }
	    }
	    return -1;
	}*/
	
	//Notes:-find unsorted array 
	//2.Optimal Level
		public static int minEleRotateArr(int[] arr){
	    int left=0,right=arr.length-1;
	    while(left<right){
	        int mid=(left+right)/2;
	        if(arr[mid]>arr[right]){
	            left=mid+1;
	        }
	        else{
	            right=mid;
	        }
	    }
	    return arr[left];
	}
	
	//Notes:-find sorted array side min value
	//3.Optimal Level
	/*public static int minEleRotateArr(int[] arr){
		int min = Integer.MAX_VALUE;
	    int low=0,high=arr.length-1;
	    
	    if(arr[low]<=arr[high])
	            return arr[low];
	    
	    while(low<=high){
	        int mid=(low+high)/2;
	        if(arr[low]<=arr[mid]){
	            min=Math.min(min,arr[low]);
	            low=mid+1;
	        }else{
	            min=Math.min(min,arr[mid]);
	            high=mid-1;
	        }
	    }
	
	    return min;
	}*/

}

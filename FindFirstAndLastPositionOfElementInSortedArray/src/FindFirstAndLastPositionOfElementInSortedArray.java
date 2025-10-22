import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {
	public static void main(String[] args) {
		int[] arr= {5,7,7,8,8,8,8,10};
		int target=8;
		int[] res=searchRange(arr,target);
		System.out.println(Arrays.toString(res));
	}
	//1.Brute Level
	/*public static int[] searchRange(int[] arr,int target) {
		int first=-1,second=-1;
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]==target){
	            if(first==-1) {
	                first=i;
	            }
	            second=i;
	        }
	    }
	    return new int[]{first,second};
	}*/
	
	public static int[] searchRange(int[] arr,int k) {
		int low=lowerBound(arr,k);
	    if(arr[low]!=k) return new int[]{-1,-1};
	    int up=upperBound(arr,k);
	    return new int[]{low,up};
	}
	public static int lowerBound(int[] arr,int k){
	    int low=0,high=arr.length-1,first=-1;
	    while(low<=high){
	        int mid=(low+high)/2;
	        if(arr[mid]>=k){
	            first=mid;
	            high=mid-1;
	        }
	        else{
	            low=mid+1;
	        }
	    }
	    return first;
	}
	
	public static int upperBound(int[] arr,int k){
	    int low=0,high=arr.length-1,second=-1;
	    while(low<=high){
	        int mid=(low+high)/2;
	        if(arr[mid]>k){
	            second=mid-1;
	            high=mid-1;
	        }
	        else{
	            low=mid+1;
	        }
	    }
	    return second;
	}
}

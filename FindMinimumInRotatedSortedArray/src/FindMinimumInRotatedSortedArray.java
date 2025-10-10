import java.util.*;
public class FindMinimumInRotatedSortedArray {
	public static void main(String[] args) {
		int[] arr={4,5,6,7,0,1,2};
		int res=minEleRotateArr(arr);
		System.out.println(res);
	}
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

}

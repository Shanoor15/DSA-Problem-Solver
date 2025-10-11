import java.util.Arrays;
public class SearchInRotatedSortedArray {
	public static void main(String[] args) {
		int[] arr={2,5,6,0,0,1,2};
		int target=0;
		boolean res=search(arr,target);
		System.out.println(res);
	}
	/*public static boolean search(int[] arr,int target){
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]==target){
	            return true;
	        }
	    }
	    return false;
	}*/
	
	public static boolean search(int[] arr,int target){
	    Arrays.sort(arr);
	    int left=0,right=arr.length-1;
	    while(left<=right){
	        int mid=(left+right)/2;
	        if(arr[mid]==target)
	            return true;
	        if(arr[mid]>target)
	            right=mid-1;
	        else
	            left=mid+1;
	    }
	    return false;
	}

}

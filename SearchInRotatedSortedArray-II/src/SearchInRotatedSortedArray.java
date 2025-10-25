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
		 int low=0,high=arr.length-1;
	        while(low<=high){
	            int mid=(low+high)/2;
	            if(arr[mid]==target){
	                return true;
	            }
	            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
	                low=low+1;
	                high=high-1;
	                continue;
	            }
	            if(arr[low]<=arr[mid]){
	                if(arr[low]<=target && target<=arr[mid]){
	                    high=mid-1;
	                }else{
	                    low=mid+1;
	                }
	            }else{
	                if(arr[mid]<=target && target<=arr[high]){
	                    low=mid+1;
	                }else{
	                    high=mid-1;
	                }
	            }
	        }
	        return false;
	}

}

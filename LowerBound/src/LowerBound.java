
public class LowerBound {
	public static void main(String[] args) {
        int[] arr={1,2,3,4,6,6,8,11};
        int k=6;
        int res=lowerBound(arr,k);
        System.out.println(res);
    }
	
	//1.Brute Level
	/* public static int lowerBound(int[] arr,int k){
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]>=k){
	            return i;
	        }
	    }
	    return -1;
	}*/
	
	public static int lowerBound(int[] arr,int k){
		int low=0,high=arr.length-1;
		while(low<high) {
			int mid=(low+high)/2;
			if(arr[mid]==k) {
				if(arr[mid-1]==arr[mid]) {
					return mid-1;
				}else {
					return mid;
				}
			}
			else if(arr[mid]>k) high=mid-1;
			else low=mid+1;
		}
		return -1;
	}

}

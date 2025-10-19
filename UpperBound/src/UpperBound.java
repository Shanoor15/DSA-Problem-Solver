
public class UpperBound {

	public static void main(String[] args) {
		int[] arr={1,2,3,4,6,6,8,11};
        int k=6;
        int res=upperBound(arr,k);
        System.out.println(res);
	}
	/*public static int upperBound(int[] arr,int k){
		for (int i = 0; i < arr.length; i++) {
	        if (arr[i] > k) {
	            return i;
	        }
	    }
	    return arr.length;
	}*/
	
	//2.Optimal Level
	public static int upperBound(int[] arr,int k){
		int n=arr.length,low=0,high=n-1;
        int min=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>k){
                min=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return min;
	}
}

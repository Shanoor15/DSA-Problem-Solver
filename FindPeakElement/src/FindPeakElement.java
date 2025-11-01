
public class FindPeakElement {

	public static void main(String[] args) {
		//int[] arr= {1,2,1,3,5,6,4};
		//int[] arr= {1,2,3,4,5};
		//int[] arr={1,2,1,3,5,6,4};
		int[] arr= {2,1};
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
	
	//2.Better Level
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
	
	/*public static int findPeak(int[] arr) {
		int n=arr.length;
	    for(int i=0;i<n;i++){
	        if(((i==0)||(arr[i-1]<arr[i])) && ((i==n-1)||(arr[i]>arr[i+1])))
	        	return i;
	    }
	    return 0;
	}*/
	
	//3.Optimal Level
	public static int findPeak(int[] arr) {
		int n=arr.length;
		int low=1,high=n-2;
		if(n==1) return 0;
		if(arr[0]>arr[1]) return 0;
		if(arr[n-1]>arr[n-2]) return n-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]) {
				return mid;
			}else if(arr[mid-1]<arr[mid]) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return 0;
	}

}

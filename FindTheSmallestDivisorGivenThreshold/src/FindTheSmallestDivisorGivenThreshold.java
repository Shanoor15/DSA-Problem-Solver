import java.util.Arrays;

public class FindTheSmallestDivisorGivenThreshold {
	public static void main(String[] args) {
		int[] arr= {1,2,5,9};
		int threshold=6;
		int res=smallestDivisor(arr,threshold);
		System.out.println(res);
	}
	/*public static int smallestDivisor(int[] arr, int threshold) {
		for(int div=1;div<=Arrays.stream(arr).max().getAsInt();div++) {
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum+=Math.ceil((double)arr[i]/div);
			}
			if(sum<=threshold)
				return div;
		}
		return -1;
	}*/
	
	//1.Brute Level
	/*public static int smallestDivisor(int[] arr, int threshold) {
	    int div=1;
	    int sum=smallDivisor(arr,div);
	    while(sum>threshold){
	        div++;
	        sum=smallDivisor(arr,div);
	    }
	    return div;
	}
	public static int smallDivisor(int[] arr,int div){
	    int sum=0;
	    for(int i=0;i<arr.length;i++){
	        sum+=Math.ceil((double)arr[i]/div);
	    }
	    return sum;
	}*/
	
	//2.Optimal Level
	public static int smallestDivisor(int[] arr, int threshold) {
		int low=1,high=Arrays.stream(arr).max().getAsInt(),div=-1;
		if(arr.length>threshold) 
            return -1;
		while(low<=high) {
			int mid=(low+high)/2;
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum+=Math.ceil((double)arr[i]/mid);
			}
			if(sum<=threshold) {
				div=mid;
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return div;
	}

}

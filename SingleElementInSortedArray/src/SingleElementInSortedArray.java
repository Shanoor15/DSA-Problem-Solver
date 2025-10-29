
public class SingleElementInSortedArray {

	public static void main(String[] args) {
		int[] arr= {1,1,2,3,3,4,4,8,8};
		int res=singleEle(arr);
		System.out.println(res);
	}
	//1.Better Level
	/*public static int singleEle(int[] arr) {
		int ans=-1;
	for(int i=0;i<arr.length;i++) {
		int cnt=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				cnt++;
			}
		}
		if(cnt==1)
			ans=arr[i];
	}
	return ans;
	}*/
	
	//2.Better Level
	/*public static int singleEle(int[] arr) {
		int n=arr.length;
		if(n==1)
			return arr[0];
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				if(arr[i]!=arr[i+1])
					return arr[i];
			}
			else if(i==n-1) {
				if(arr[i]!=arr[i-1])
					return arr[i];
			}
			else {
				if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1])
					return arr[i];
			}
		}
		return -1;
	}*/
	
	//2.Better Level
	/*public static int singleEle(int[] arr) {
		int left=0,right=1,ans=-1;
	    if(arr.length<2)
	        return arr[0];
	    while(left<arr.length && right<arr.length){
	        if(arr[left]!=arr[right]){
	            return arr[left];
	        }else{
	            left=right+1;
	            right=left+1;
	        }
	    }
	    return arr[left];
	}*/
	
	
	//3.Optimal Level
	public static int singleEle(int[] arr) {
		int n=arr.length;
		if(n==1)
			return arr[0];
		if(arr[0]!=arr[1])
			return arr[0];
		if(arr[n-1]!=arr[n-2])
			return n-1;
		int low=0,high=n-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) {
				return arr[mid];
			}
			//eliminating the left half
			if(mid%2==1 && arr[mid]==arr[mid-1] || mid%2==0 && arr[mid]==arr[mid+1])
				low=mid+1;
			else
				high=mid-1;
		}
		return -1;
	}
}

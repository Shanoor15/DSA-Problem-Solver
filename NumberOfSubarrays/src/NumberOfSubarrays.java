import java.util.HashMap;

public class NumberOfSubarrays {

	public static void main(String[] args) {
		int[] arr={1,2,3,-3,1,1,1,4,2,-3};
		//int[] arr={3,0,0,3};
		int k=3;
		int result=numberOfSubarray(arr,k);
		System.out.println("Number Of SubArray::"+result);
	}
	//1.Brute Level
	/*public static int numberOfSubarray(int[] arr,int target){
		int cnt=0;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int sum=0;
				for(int k=i;k<=j;k++) {
					sum+=arr[k];
				}
				if(sum==target)
					cnt++;
			}
		}
		return cnt;
	}*/
	
	//1.Better Level
	/*public static int numberOfSubarray(int[] arr,int k){
	    int count=0;
	    for(int i=0;i<arr.length;i++){
	        int sum=0;
	        for(int j=i;j<arr.length;j++){
	            sum+=arr[j];
	            if(sum==k){
	                count++;
	            }
	        }
	    }
	    return count;
	}*/
	
	//3.Optimal Level
	public static int numberOfSubarray(int[] arr,int k){
	    HashMap<Integer,Integer> map=new HashMap<>();
	    int preSum=0,cnt=0;
	    map.put(0,1);
	    for(int i=0;i<arr.length;i++){
	        preSum+=arr[i];
	        int rev=preSum-k;
	        if(map.containsKey(rev)){
	            cnt+=map.get(rev);
	        }
	        map.put(preSum,map.getOrDefault(preSum,0)+1);
	    }
	    return cnt;
	}
}

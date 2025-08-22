public class LargestSubarrayOnlyPositive {
	public static void main(String[] args) {
		//int[] arr={1,2,3,1,1,1,1,4,2,3};
		int[] arr={2,0,0,0,3};
		int k=3;
		int result=largestSubarray(arr,k);
		System.out.println(result);
	}
	//1.Brute Level
	/*public static int largestSubarray(int[] arr,int k){
	    int max=0;
	    for(int i=0;i<arr.length;i++){
	        int count=0,largest=0;
	        for(int j=i;j<arr.length;j++){
	            largest+=arr[j];
	            if(largest<=k)
	                count++;
	            else{
	                max=Math.max(max,count);
	                break;
	            }
	        }
	        max=Math.max(max,count);
	    }
	    return max;
	}*/
	
	//2.Better Level
/*	public static int largestSubarray(int[] arr,int k){
	    HashMap<Integer,Integer> map=new HashMap<>();
	    int sum=0,len=0,max=0;
	    for(int i=0;i<arr.length;i++){
	        sum+=arr[i];
	        if(sum==k){
	            max=Math.max(max,i+1);
	        }
	        int rem=sum-k;
	        if(map.containsKey(rem)){
	            len=i-map.get(rem);
	            max=Math.max(max,len);
	        }
	        if(!map.containsKey(sum)){
	            map.put(sum,i);
	        }
	        //map.put(sum,i);->not work for arr{2,0,0,3} k=3 
	    }
	    return max;
	}*/
	
	//3.Optimal Level
	public static int largestSubarray(int[] arr,int k){
		int sum=arr[0],max=0,i=0,j=0;
	    while(i<arr.length){
	        while(j<=i && sum>k){
	            sum-=arr[j];
	            j++;
	        }
	        if(sum==k){
	            max=Math.max(max,i-j+1);
	        }
	        i++;
	        if(i<arr.length) sum+=arr[i];
	    }
	    return max;
	}

}

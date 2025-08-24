
public class NumberOfSubarrays {
	public static void main(String[] args) {
		int[] arr={1,2,3,1,1,1,1,4,2,3};
		//int[] arr={3,0,0,3};
		int k=3;
		int result=numberOfSubarray(arr,k);
		System.out.println("Number Of SubArray::"+result);
	}
	
	//1.Brute Level
		/*public static int numberOfSubarray(int[] arr,int k){
		    int count=0;
		    for(int i=0;i<arr.length;i++){
		        int sum=0;
		        for(int j=i;j<arr.length;j++){
		            sum+=arr[j];
		            if(sum>k)
		                break;
		            if(sum==k){
		                count++;
		            }
		        }
		    }
		    return count;
		}*/
		
		//2.better level
		/*public static int numberOfSubarray(int[] arr,int k){
		    HashMap<Integer,Integer> map=new HashMap<>();
		    int sum=0,max=0,count=0;
		    for(int i=0;i<arr.length;i++){
		        sum+=arr[i];
		        if(sum==k){
		            //max=Math.max(max,i+1);
		            count++;
		        }
		        int rev=sum-k;
		        if(map.containsKey(rev)){
		            //int leng=i-map.get(rev);
		            //max=Math.max(max,leng);
		            count++;
		        }
		        if(!map.containsKey(sum)){
		            map.put(sum,i);
		        }
		    }
		    return count;
		}*/
		
		//3.Optimal Level
		public static int numberOfSubarray(int[] arr,int k){
		    int i=0,j=0,count=0,sum=arr[0];
		    while(i<arr.length){
		        while(j<=i && sum>k){
		            sum-=arr[j];
		            j++;
		        }
		        if(sum==k){
		            count++;
		        }
		        i++;
		        if(i<arr.length) sum+=arr[i];
		    }
		    return count;
		}

}

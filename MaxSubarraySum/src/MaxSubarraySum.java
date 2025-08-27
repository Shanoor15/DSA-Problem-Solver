
public class MaxSubarraySum {
	public static void main(String[] args) {
		int[] arr={-2,-3,4,-1,-2,1,5,-3};
		int n=arr.length;
		int result=maxSubarray(arr,n);
		System.out.println("Sum Of Two Numbers::"+result);
	}
	//1.Brute Level
		/*public static int maxSubarray(int[] arr,int n){
		    int max=Integer.MIN_VALUE;
		    for(int i=0;i<n;i++){
		        for(int j=i;j<n;j++){
		            int sum=0;
		            for(int k=i;k<=j;k++){
		                sum+=arr[k];
		                max=Math.max(max,sum);
		            }
		        }
		    }
		    return max;
		}*/
		
		//2.Better Level
		/*public static int maxSubarray(int[] arr,int n){
		    int max=Integer.MIN_VALUE;
		    for(int i=0;i<n;i++){
		        int sum=0;
		        for(int j=i;j<n;j++){
		            sum+=arr[j];
		            if(sum>max)
		            max=Math.max(max,sum);
		        }
		    }
		    return max;
		}*/
		
		//3.Optimal level(work for arr must be contain one +ve number or zero,it is not work for all -ve ele in arr)
		/*public static int maxSubarray(int[] arr,int n){
		    int max=Integer.MIN_VALUE,sum=0,start=0,ansStart=-1,ansEnd=-1;
		    for(int i=0;i<n;i++){
		        sum+=arr[i];
		        if(sum<0){
		            sum=0;
		        } 
		        else if(sum>max){
		            max=sum;
		        }
		    }
		    return max;
		}*/
		
		//3.Optimal level(work for arr which contains only -ve or +ve or both)
		public static int maxSubarray(int[] arr,int n){
		    int max=arr[0];
		    int sum=arr[0];
		    for(int i=1;i<n;i++){
		        sum=Math.max(arr[i],sum+arr[i]);
		        max=Math.max(max,sum);
		    }
		    return max;
		}

}

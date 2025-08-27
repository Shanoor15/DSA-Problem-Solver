import java.util.Arrays;
public class MaximumSubarray {
		public static void main(String[] args) {
			int[] arr={-2,-3,4,-1,-2,1,5,-3};
			//int[] arr = {-3, -2, -5};
			int n=arr.length;
			int[] result=maxSubarray(arr,n);
			System.out.println("Sum Of Two Numbers::"+Arrays.toString(result));
		}
		//1.Brute Level
			/*public static int[] maxSubarray(int[] arr,int n){
		    int start = -1, end = -1, max = Integer.MIN_VALUE;
		    for(int i = 0; i < n; i++){
		        for(int j = i; j < n; j++){
		            int sum = 0;
		            for(int k = i; k <= j; k++){
		                sum += arr[k];
		                if(sum > max){
		                    max = Math.max(max, sum);
		                    start=i;
		                    end = j;
		                }
		            }
		        }
		    }
		    return new int[]{start, end};
		}*/
		    //2.Better Level
		    /*public static int[] maxSubarray(int[] arr,int n){
		        int start=-1,end=-1,max=Integer.MIN_VALUE;
		        for(int i=0;i<n;i++){
		            int sum=0;
		            for(int j=i;j<n;j++){
		                sum+=arr[j];
		                if(sum>max){
		                    max=Math.max(max,sum);
		                    start=i;
		                    end=j;
		                }
		            }
		        }
		        return new int[]{start,end};
		    }*/
		    
		    //3.Optimal Level
		    /*public static int[] maxSubarray(int[] arr,int n){
		        int sum=0,start=0,end=0,max=Integer.MIN_VALUE;
		        for(int i=0;i<n;i++){
		            if(sum==0) start=i;
		            sum+=arr[i];
		            if(sum<0) sum=0;
		            else if(sum>max){
		                    max=sum;
		                    end=i;
		            }
		        }
		        return new int[]{start,end};
		    }*/
		    
		    public static int[] maxSubarray(int[] arr,int n){
		        int sum=arr[0],start=0,ansStart=0,ansEnd=0,max=arr[0];
		        for(int i=1;i<n;i++){
		            if(sum<0){
		                sum=arr[i];
		                start=i;
		            }
		            else{
		            sum+=arr[i];
		            }
		            sum=Math.max(arr[i],sum);
		            if(sum>max){
		                max=sum;
		                ansStart=start;
		                ansEnd=i;
		            }
		        }
		        return new int[]{ansStart,ansEnd};
		    }
}

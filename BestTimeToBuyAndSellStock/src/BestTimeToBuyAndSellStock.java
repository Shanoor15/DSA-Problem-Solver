
public class BestTimeToBuyAndSellStock {
	public static void main(String[] args) {
		int[] arr = {7,1,5,3,6,4};
		//int[] arr = {3, 2, 6, 1, 5};
		int n=arr.length;
		int result=maxProfit(arr,n);
		System.out.println(result);
	}
	//1.Brute Level
	/*public static int maxProfit(int[] arr,int n){
	    int max=0,ind=0;
	    int buy=Integer.MAX_VALUE,sell=Integer.MIN_VALUE;
	    for(int i=0;i<n;i++){
	            if(arr[i]<buy){
	                buy=arr[i];
	                ind=i;
	            }
	        }
	        for(int j=ind;j<n;j++){
	            if(arr[j]>sell){
	                sell=arr[j];
	            }
	        }
	    int profit=sell-buy;
	    max=Math.max(profit,max);
	    return max;
	}*/
	
	//2.Optimal Level
	public static int maxProfit(int[] arr,int n){
	    int min=arr[0],profit=0;
	    for(int i=1;i<n;i++){
	        if(arr[i]<min){
	            min=arr[i];
	        }
	        else{
	            profit=Math.max(profit,arr[i]-min);
	        }
	    }
	    return profit;
	}

}

public class MaximumProductSubarray {
	public static void main(String[] args) {
		int[] arr={2,3,-2,4};
		int res=maxProduct(arr);
		System.out.println(res);
	}
	//1.Brute Level
	/*public static int maxProduct(int[] arr){
	    int n=arr.length;
	    int max=Integer.MIN_VALUE;
	    for(int i=0;i<n;i++){
	        for(int j=i;j<n;j++){
	            int prod=1;
	            for(int k=i;k<=j;k++){
	                prod=prod*arr[k];
	            }
	            max=Math.max(max,prod);
	        }
	    }
	    return max;
	}*/
	
	//2.Better Level
	/*public static int maxProduct(int[] arr){
	    int n=arr.length;
	    int max=Integer.MIN_VALUE;
	    for(int i=0;i<n;i++){
	        int prod=1;
	        for(int j=i;j<n;j++){
	            prod=prod*arr[j];
	            max=Math.max(max,prod);
	        }
	    }
	    return max;
	}*/
	
	//3.Optimal Level
	public static int maxProduct(int[] arr){
	    int n=arr.length;
	    int max=Integer.MIN_VALUE;
	    int prifix=1,sufix=1;
	    for(int i=0;i<=n-1;i++){
	        if(prifix==0) prifix=1;
	        if(sufix==0) sufix=1;
	        prifix=prifix*arr[i];
	        sufix=sufix*arr[n-i-1];
	        max=Math.max(max,Math.max(prifix,sufix));
	    }
	    return max;
	}

}

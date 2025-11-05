
public class SumOfSquareNumbers {
	public static void main(String[] args) {
		int n=3;
		boolean res=sumOfSquare(n);
		System.out.println(res);
	}
	//1.Brute Level
	/*public static boolean sumOfSquare(int n){
		for(int i=0;i<Math.sqrt(n);i++) {
			for(int j=0;j<Math.sqrt(n);j++) {
				int value=i*i+j*j;
				if(value==n) {
					return true;
				}
			}
		}
		return false;
	}*/
	
	//2.Optimal Level
		public static boolean sumOfSquare(int n){
	    int left=0,right=n;
	    while(left<=right){
	        int val1=left*left,val2=right*right;
	        if(val1+val2==n){
	            return true;
	        }
	        if(val1+val2>n)
	            right--;
	        else
	            left++;
	    }
	    return false;
	}

}

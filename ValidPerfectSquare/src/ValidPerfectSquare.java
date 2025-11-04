
public class ValidPerfectSquare {
	public static void main(String[] args) {
		int n=16;
		boolean res=findPerfect(n);
		System.out.println(res);
	}
	//1.Brute Level
	/*public static boolean findPerfect(int n) {
		for(int i=1;i<=n;i++){
	        if(i*i==n){
	            return true;
	        }
	    }
	    return false;
	}*/
	
	//2.Better Level
	/*public static boolean findPerfect(int n) {
		for(int i=1;i<=n/i;i++){
	        if(i*i==n){
	            return true;
	        }
	    }
	    return false;
	}*/
	
	//3.Optimal Level
	public static boolean findPerfect(int n) {
		int low=1,high=n;
		while(low<=high) {
			int mid=low+(high-low)/2;
			Long value=(long)mid*mid;
			if(value==n) {
				return true;
			}
			if(value>n) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return false;
	}
}


public class Sqrt {
	public static void main(String[] args) {
		//int n=36;
		int n=2147483647;
		int res=findSqrt(n);
		System.out.println(res);
	}
	
	//1.Brute Level
	/*public static int findSqrt(int n) {
		int ans=0;
		for(int i=1;i<=n;i++) {
			if((long)i*i<=n) {
				ans=i;
			}else {
				break;
			}
		}
		return ans;
	}*/
	
	/*public static int findSqrt(int n) {
		int ans=0;
		for(int i=1;i<=n/i;i++) {
			if((long)i*i<=n) {
				ans=i;
			}
		}
		return ans;
	}*/	
	
	//2.Better Level
	/*public static int findSqrt(int n) {
		int root=(int)Math.sqrt(n);
		return root;
	}*/
	
	//3.Optimal Level
	public static int findSqrt(int n) {
		int low=1,high=n,ans=0;
		while(low<=high) {
			int mid=low+(high-low)/2;
			long value=(long)mid*mid;
			if(value==n) {
				ans=mid;
			}
			if(value<n) {
				ans=mid;
				low=mid+1;
			}
			else
				high=mid-1;
		}
		return ans;
	}
}

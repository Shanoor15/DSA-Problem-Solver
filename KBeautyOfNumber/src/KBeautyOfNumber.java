import java.util.*;
public class KBeautyOfNumber {
	public static void main(String[] args) {
		int n=430043;
		int k=2;
		int res=kBeauty(n,k);
		System.out.println(res);
	}
	public static int kBeauty(int n,int k){
	    int org=n,cnt=0;
	    int pow=(int)Math.pow(10,k);
	    while(n>=pow/10){  // ensure at least k digits remain
	        int rev=n%pow;
	        if(rev!=0 && org%rev==0){
	            cnt++;
	        }
	        n/=10;
	    }
	    return cnt;
	}

}

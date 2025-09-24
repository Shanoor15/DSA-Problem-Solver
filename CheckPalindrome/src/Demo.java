import java.util.*;
public class Demo {
	public static void main(String[] args) {
		int n=121;
		boolean result=palindrome(n);
		System.out.println(result);
	}
	//1.Brute Level
	/*public static boolean palindrome(int n) {
		char[] c=String.valueOf(n).toCharArray();
		int left=0,right=c.length-1;
		while(left<right) {
			if(c[left]!=c[right]) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}*/
	
	//2.Optimal Level
	public static boolean palindrome(int n) {
		int org=n,rev=0;
		if(n<0) //-ve number are not palindrome
			return false;
		while(n>0) {
			int res=n%10;
			rev=rev*10+res;
			n/=10;
		}
		return org==rev;
	}

}

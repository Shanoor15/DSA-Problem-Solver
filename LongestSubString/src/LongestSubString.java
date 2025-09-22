import java.util.*;
public class LongestSubString {
	public static void main(String[] args) {
		//String s="aaaaaa";
		String s=" ";
		int result=longestSubString(s);
		System.out.println(result);
	}
	//Brute Level
	/*public static int longestSubString(String s){
	    int max=Integer.MIN_VALUE;
	    for(int i=0;i<s.length();i++){
	        Set<Character> set=new HashSet<>();
	        for(int j=i;j<s.length();j++){
	            if(set.contains(s.charAt(j))){
	                break;
	            }
	            set.add(s.charAt(j));
	            max=Math.max(max,j-i+1);
	        }
	    }
	    return max;
	}*/
	
	//2.Optimal Level
	public static int longestSubString(String s){
	    Set<Character> set=new HashSet<>();
	    int max=0;
	    int left=0,right=0,n=s.length();
	    while(left<n && right<n){
	        if(set.contains(s.charAt(right))){
	            set.remove(s.charAt(left));
	            left++;
	        }else{
	            set.add(s.charAt(right));
	            right++;
	            max=Math.max(max,right-left);
	        }
	    }
	    return max;
	}

}

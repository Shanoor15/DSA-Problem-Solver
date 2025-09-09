import java.util.*;
public class MaxCharCount {
	public static void main(String[] args) {
		String s="abcabbaca";
		char ch='a';
		int result=maxCharCount(s,ch);
		System.out.println(result);
	}
	//Brute Level
	/*public static int maxCharCount(String s,char ch){
	    int cnt=0;
	    for(int i=0;i<s.length();i++){
	        if(s.charAt(i)==ch)
	            cnt++;
	    }
	    return cnt;
	}*/
	
	//Lowercase English Letters Only
	/*public static int maxCharCount(String s,char ch){
	    int[] hash=new int[26];
	    for(int i=0;i<s.length();i++){
	        hash[s.charAt(i)-'a']+=1;
	    }
	    return hash[ch-'a'];
	}*/
	
	//All Characters(upper & lower) Characters
	public static int maxCharCount(String s,char ch){
	    int[] hash=new int[256];
	    for(int i=0;i<s.length();i++){
	        hash[s.charAt(i)]+=1;
	    }
	    return hash[ch];
	}

}

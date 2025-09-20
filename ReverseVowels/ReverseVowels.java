import java.util.*;
public class ReverseVowels {
	public static void main(String[] args) {
		//String s="hello";
		String s="IceCreAm";
		String result=reverseOvels(s);
		System.out.println(result);
	}
	public static String reverseOvels(String s){
	    char[] ch=s.toCharArray();
	    int left=0,right=ch.length-1;
	    while(left<=right){
	        if(isVole(ch[left]) && isVole(ch[right])){
	            char temp=ch[left];
	            ch[left]=ch[right];
	            ch[right]=temp;
	            left++;
	            right--;
	        }
	        else if(!isVole(ch[left])){
	            left++;
	        }
	        else if(!isVole(ch[right])){
	            right--;
	        }
	    }
	    return new String(ch);
	}
	public static boolean isVole(char c){
	    return "aeiouAEIOU".indexOf(c)!=-1;//Character is exit it give ind,then it gives -1
	}
}

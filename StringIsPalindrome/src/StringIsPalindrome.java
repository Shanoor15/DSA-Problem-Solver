
public class StringIsPalindrome {
	public static void main(String[] args) {
		String s="madam";
		String res=reverse(s);
		System.out.println(res);
	}
	/*public static String reverse(String s){
	    char[] arr=s.toCharArray();
	    int left=0,right=arr.length-1;
	    while(left<=right){
	        if(arr[left]!=arr[right])
	            return "not pali";
	        else{
	            left++;
	            right--;
	        }
	    }
	    return "pali";
	}*/
	
	public static String reverse(String s){
	    int n=s.length();
	    for(int i=0;i<n/2;i++){
	        if(s.charAt(i)!=s.charAt(n-i-1)){
	            return "Not Palindrom";
	        }
	    }
	    return "Palindrom";
	}

}

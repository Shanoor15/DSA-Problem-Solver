
public class ReverseString {
	public static void main(String[] args) {
		String s="XPO";
		String res=reverse(s);
		System.out.println(res);
	}
	/*public static String reverse(String s){
	    char[] arr=s.toCharArray();
	    int left=0,right=arr.length-1;
	    while(left<right){
	        char temp=arr[left];
	        arr[left]=arr[right];
	        arr[right]=temp;
	        left++;
	        right--;
	    }
	    return new String(arr);
	}*/
	
	public static String reverse(String s){
	    String rev="";
	    char ch;
	    for(int i=0;i<s.length();i++){
	        ch=s.charAt(i);
	        rev=ch+rev;
	    }
	    return rev;
	}

}

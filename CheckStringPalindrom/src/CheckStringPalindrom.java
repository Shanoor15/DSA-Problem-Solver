
public class CheckStringPalindrom {
	public static void main(String[] args) {
		String s = "madam";
		boolean res = palindrom(s);
		System.out.println(res);
	}
	
	//1.Brute Level
	public static boolean palindrom(String s) {
		String rev=new StringBuilder(s).reverse().toString();
		return s.equalsIgnoreCase(rev);
	}

	// 2.Better Level
	/*public static boolean palindrom(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		//return s.toLowerCase().equals(rev.toLowerCase());
		return s.equalsIgnoreCase(rev);
	}*/

	// 3.Optimal Level
	/*public static boolean palindrom(String s) {
		int l=0,r=s.length()-1;
		while(l<r) {
			if(s.charAt(l)!=(s.charAt(r))) {
				return false;
			}
			if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}*/

}


public class CheckSentencePalindrom {
	public static void main(String[] args) {
		String s="A man, a plan, a canal: Panama";
		boolean res=isPalindrome(s);
		System.out.println(res);
	}
	public static boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        int l=0,r=s.length()-1;
		while(l<r) {
			if(s.charAt(l)!=(s.charAt(r))) {
				return false;
			}
			l++;
			r--;
		}
		return true;
    }

}

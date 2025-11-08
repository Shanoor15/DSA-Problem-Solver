
public class LengthOfLastWord {
	public static void main(String[] args) {
		String str="   fly me   to   the moon  ";
		int res=findLast(str);
		System.out.println(res);
	}
	public static int findLast(String str){
	    str=str.trim();
	    int cnt=0;
	    for(int i=str.length()-1;i>=0;i--){
	        if(str.charAt(i)==' '){
	            break;
	        }
	        cnt++;
	    }
	    return cnt;
	}

}

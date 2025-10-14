
public class ReverseWordsInString {

	public static void main(String[] args) {
		String s="the sky is blue";
		String res=reverseWords(s);
		System.out.println(res);
	}
	public static String reverseWords(String s) {
        String[] words=s.split(" +");
        StringBuilder sb=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            if(i!=0) 
                sb.append(" ");
        }
        return sb.toString().trim();
    }

}

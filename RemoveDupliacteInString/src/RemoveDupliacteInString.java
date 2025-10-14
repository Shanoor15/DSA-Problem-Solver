
public class RemoveDupliacteInString {
	public static void main(String[] args) {
		String s = "programming";
		String res = removeDuplicates(s);
		System.out.println(res);
	}
	/*public static String removeDuplicates(String input) {
	    String output = "";
	
	    for (int i = 0; i < input.length(); i++) {
	        boolean check = false;
	
	        for (int j = 0; j < output.length(); j++) {
	            if (output.charAt(j) == input.charAt(i)) {
	                check = true;
	                break;
	            }
	        }
	
	        if (!check) {
	            output = output + input.charAt(i);
	        }
	    }
	
	    return output;
	}*/



	/*public static String removeDuplicate(String s) {
		Set<Character> set = new LinkedHashSet<>(); // maintains order
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		String str="";
		for(char ch:set) {
			str+=ch;
		}
		return str;
	}*/

    	public static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        boolean[] seen = new boolean[256]; // for all ASCII characters

        for (char ch : s.toCharArray()) {
            if (!seen[ch]) {      // if not seen before
                seen[ch] = true;  // mark as seen
                sb.append(ch);    // keep first occurrence
            }
        }
        return sb.toString();
    }

}

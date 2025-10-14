import java.util.HashMap;
import java.util.Map;

public class FindNonRepeatingCharacterInString {
	public static void main(String[] args) {
		String s="programming";
		String res=reverse(s);
		System.out.println(res);
		
	}
	public static String reverse(String s){
	    Map<Character,Integer> map=new HashMap<>();
	    String rev="";
	    for(char ch:s.toCharArray()){
	        map.put(ch,map.getOrDefault(ch,0)+1);
	    }
	    for(Map.Entry<Character,Integer> entry:map.entrySet()){
		    if(entry.getValue()==1){
		        rev+=entry.getKey();
		    }
		}
		return rev;
	}

}

import java.util.HashMap;
import java.util.Map;

public class CountCharacterOccurrencesInString {
	public static void main(String[] args) {
		String s="Java";
		Map<Character,Integer> res=reverse(s);
		for(Map.Entry<Character,Integer> ans:res.entrySet()){
		    System.out.println(ans.getKey()+"==>"+ans.getValue());
		    
		}
		
	}
	/*public static Map<Character,Integer> reverse(String s){
	    Map<Character,Integer> map=new HashMap<>();
	    for(char ch:s.toCharArray()){
	        map.put(ch,map.getOrDefault(ch,0)+1);
	    }
	    return map;
	}*/
	
	public static Map<Character,Integer> reverse(String s){
	    Map<Character,Integer> map=new HashMap<>();
	    for(int i=0;i<s.length();i++){
	        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
	    }
	    return map;
	}
}

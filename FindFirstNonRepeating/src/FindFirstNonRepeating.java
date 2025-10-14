import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeating {
	public static void main(String[] args) {
		String s="swiss";
		char res=reverse(s);
		System.out.println(res);
		
	}
	public static char reverse(String s){
	    Map<Character,Integer> map=new HashMap<>();
	    for(char ch:s.toCharArray()){
	        map.put(ch,map.getOrDefault(ch,0)+1);
	    }
	    for(Map.Entry<Character,Integer> ans:map.entrySet()){
		    if(ans.getValue()==1){
		        return ans.getKey();
		    }
		}
		return '_';
	}

}

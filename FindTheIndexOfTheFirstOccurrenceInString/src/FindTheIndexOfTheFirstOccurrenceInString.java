
public class FindTheIndexOfTheFirstOccurrenceInString {
	public static void main(String[] args) {
		String str1="sadbutsad";
		String str2="but";
		int res=firstOccurence(str1,str2);
	    System.out.println(res);
	}
    public static int firstOccurence(String str1,String str2) {
    	for(int i=0;i<str1.length()-str2.length()+1;i++){
            if(str1.charAt(i)==str2.charAt(0)){
                if(str1.substring(i,str2.length()+i).equals(str2)){
                    return i;
                }
            }
        }
        return -1;
	}

}

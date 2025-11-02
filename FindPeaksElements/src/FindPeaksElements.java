import java.util.ArrayList;
import java.util.List;

public class FindPeaksElements {

	public static void main(String[] args) {
		int[] arr= {1,4,3,8,5};
		List<Integer> res=findPeaks(arr);
		System.out.println(res);
	}
	
	//1.Better Level
		public static List<Integer> findPeaks(int[] arr){
		List<Integer> list=new ArrayList<>();
	    int n=arr.length;
	    if(arr.length==1) list.add(0);
	    for(int i=1;i<=n-2;i++){
	        if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
	            list.add(i);
	        }
	    }
	    return list;
	}
}

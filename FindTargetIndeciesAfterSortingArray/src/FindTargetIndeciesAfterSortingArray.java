import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndeciesAfterSortingArray {

	public static void main(String[] args) {
		int[] arr= {1,2,5,2,3};
		int target=2;
		List<Integer> res=targetIndices(arr,target);
		System.out.println(res);
	}
	/*public static List<Integer> targetIndices(int[] arr, int target) {
	    List<Integer> list=new ArrayList<>();
	    Arrays.sort(arr);
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]==target)
	            list.add(i);
	    }
	    return list;
	}*/
	
	public static List<Integer> targetIndices(int[] arr, int target) {
		int tcount=0,count=0;
		for(int num:arr) {
			if(target==num)
				tcount++;
			else if(num<target)
				count++;
		}
		List<Integer> list=new ArrayList<>();
		while(tcount>0) {
			list.add(count);
			count++;
			tcount--;
		}
		return list;
	}
}

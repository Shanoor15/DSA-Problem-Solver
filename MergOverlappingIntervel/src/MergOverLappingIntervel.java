import java.util.*;
public class MergOverLappingIntervel {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 3},
            {2, 6},
            {8, 9},
            {9, 11},
            {8, 10},
            {2, 4},
            {15, 18},
            {16, 17}
        };
        List<List<Integer>> res = mergeIntervals(arr);
        for (List<Integer> row : res) {
            System.out.println(row);
        }
    }

    	//1.Brute Level
    	/*private static List<List<Integer>> mergeIntervals(int[][] arr) {
		int n = arr.length;
		Arrays.sort(arr, (a, b) -> a[0] - b[0]); 
		List<List<Integer>> ans = new ArrayList<>();
		for (int i = 0; i < n; i++) {
		    int start = arr[i][0];
		    int end = arr[i][1];
		    if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) {
		        continue;
		    }
		    for (int j = i + 1; j < n; j++) {
		        if (arr[j][0] <= end) {
		            end = Math.max(end, arr[j][1]);
		        } else {
		            break;
		        }
		    }
		    ans.add(Arrays.asList(start, end));
		}
		return ans;*/
  
		/*private static int[][] mergeIntervals(int[][] arr) {
		        int n = arr.length;
		        Arrays.sort(arr, (a, b) -> a[0] - b[0]); 
		        List<int[]> ans = new ArrayList<>();
		        
		        for (int i = 0; i < n; i++) {
		            int start = arr[i][0];
		            int end = arr[i][1];
		          
		            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1)[1]) {
		                continue;
		            }
		            
		            for (int j = i + 1; j < n; j++) {
		                if (arr[j][0] <= end) {
		                    end = Math.max(end, arr[j][1]);
		                } else {
		                    break;
		                }
		            }
		            ans.add(new int[]{start, end});
		        }
		        
		        return ans.toArray(new int[ans.size()][]);
		    }*/
    
    //2.Better Level
    private static List<List<Integer>> mergeIntervals(int[][] arr) {
    	Arrays.sort(arr,(a,b)->a[0]-b[0]);
    	List<List<Integer>> ans=new ArrayList<>();
    	int start=arr[0][0],end=arr[0][1];
    	for(int i=1;i<arr.length;i++) {
    		if(arr[i][0]<=end) {
    			end=Math.max(end, arr[i][1]);
    		}else{
    			ans.add(Arrays.asList(start,end));
    			start=arr[i][0];
    			end=arr[i][1];
    		}
    	}
    	ans.add(Arrays.asList(start,end));
    	return ans;
    }
}

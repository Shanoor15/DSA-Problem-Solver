/*Input: {2, 1, 5, 4, 3, 0, 0}
Output: [2, 3, 0, 0, 1, 4, 5] 

Input: {3, 2, 1}
Output: [1, 2, 3]*/

import java.util.*;
public class NextPermitation {
	public static void main(String[] args) {
		int[] arr={2,1,5,4,3,0,0};
		//int arr[] = {3,1,2};
		int n=arr.length;
		int[] result=nextPermitation(arr,n);
		System.out.println(Arrays.toString(result));
	}
	public static int[] nextPermitation(int[] arr,int n){
	    // Step 1: Find the first index from the end where arr[i] < arr[i + 1]
	    int ind=-1;
	    for(int i=n-2;i>=0;i--){
	        if(arr[i]<arr[i+1]){
	            ind=i;
	            break;
	        }
	    }
	    // Step 2: If no such index found, it's the last permutation -> reverse entire array
	    if(ind==-1){
	        reverArray(arr,0,n);
	        return arr;
	    }
	    
	    //find >arr[ind] but smallest one and swap or Step 3: Find just greater element to the right of ind and swap
	    for(int i=n-1;i>ind;i--){
	        if(arr[i]>arr[ind]){
	           int temp=arr[i];
	           arr[i]=arr[ind];
	           arr[ind]=temp;
	           break;
	        }
	    }
	    // Step 4: Reverse the suffix starting at ind + 1
	    reverArray(arr,ind,n);
	    return arr;
	}
	//Try to place remaining in sorted order(ASC)
	public static void reverArray(int[] arr,int i,int n){
	    int start = i + 1;
        int end = n - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
	}

}

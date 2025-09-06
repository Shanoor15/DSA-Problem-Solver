import java.util.*;
public class ThirdMax {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,3,4};
		int n=arr.length;
		int result=thirdMax(arr,n);
		System.out.println(result);
	}
	/*public static int thirdMax(int[] arr,int n){
	    long sentinal=(long)Integer.MIN_VALUE-1;
	    long max1=sentinal,max2=sentinal,max3=sentinal;
	    TreeSet<Integer> set=new TreeSet<>();
	    for(int num:arr){
	        set.add(num);
	    }
	    for(int num:set){
	        if(num>max1){
	            max3=max2;
	            max2=max1;
	            max1=num;
	        }else if(num>max2){
	            max3=max2;
	            max2=num;
	        }else if(num>max3){
	            max3=num;
	        }
	    }
	    return (max3!=sentinal)?(int)max3:(int)max1;
	}*/
	
	//3.Optimal Level
	    public static int thirdMax(int[] arr,int n){
	    long sentinal=(long)Integer.MIN_VALUE-1;
	    long max1=sentinal,max2=sentinal,max3=sentinal;
	    for(int num:arr){
	        //To Skip Duplicate values
	        if(num==max1 || num==max2 || num==max3)
	            continue;
	        if(num>max1){
	            max3=max2;
	            max2=max1;
	            max1=num;
	        }else if(num>max2){
	            max3=max2;
	            max2=num;
	        }else if(num>max3){
	            max3=num;
	        }
	    }
	    // If the third maximum does not exist, return the maximum number
	    return (max3!=sentinal)?(int)max3:(int)max1;
	}

}

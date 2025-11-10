
public class FindTheSmallestDivisorGivenThreshold {
	public static void main(String[] args) {
		int[] arr= {1,2,5,9};
		int threshold=6;
		int res=smallestDivisor(arr,threshold);
		System.out.println(res);
	}
	public static int smallestDivisor(int[] arr, int threshold) {
        int div=1;
        int sum=smallDivisor(arr,div);
        while(sum>threshold){
            div++;
            sum=smallDivisor(arr,div);
        }
        return div;
    }
    public static int smallDivisor(int[] arr,int div){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=Math.ceil((double)arr[i]/div);
        }
        return sum;
    }

}

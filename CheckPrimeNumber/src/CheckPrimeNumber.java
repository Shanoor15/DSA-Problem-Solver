
public class CheckPrimeNumber {
	public static void main(String[] args) {
	    int n=29;
		boolean res = checkPrime(n);
		System.out.println(res);
	}
    public static boolean checkPrime(int n) {
        if(n<=1) return false;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}

public class MaxEvenOddSubarray{
	public static void main(String[] args){
		int max=1;
		int[] A={72,1,12,1};
		int count=1;
		for(int i=1;i<A.length;i++){
			// if((A[i]+A[i+1])%2!=0){
			// 	count++;
			// 	max=Math.max(max,count);
			// }

			if((A[i]%2==0 && A[i-1]%2!=0) || (A[i]%2!=0 && A[i-1]%2==0)){
				count++;
				max=Math.max(max,count);
			}
			else{
				count=1;
			}

		}
		System.out.println(max);
	}


}

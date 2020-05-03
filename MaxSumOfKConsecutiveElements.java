public class MaxSumOfKConsecutiveElements{
	public static void main(String[] args){
		int[] A = {5,-10,6,90,3};
		int k=2;
		int sum=0;
		for(int i=0;i<k;i++){
			sum=sum+A[i];
		}
		int first=A[0];
		int tempSum=sum;
		for(int j=1;j<=A.length-k;j++){
			tempSum=tempSum+A[j+k-1]-first;
			sum=Math.max(tempSum,sum);
			first=A[j];
		}

		System.out.println(sum);


		
	}


}

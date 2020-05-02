class KadanesAlgo{

	public static void main(String[] args){
		//int[] A={-2,-3,4,-1,-2,1,5,-3};
		int[] A={1,-3,2,1,-1};
		int answ=kadanesAlgo(A);
		System.out.println(answ);

	}

	private static int kadanesAlgo(int[] A){

		int max=A[0];
		int maxVal=max;
		for(int i=0;i<A.length;i++){
			maxVal=Math.max(A[i],A[i]+maxVal);
			max=Math.max(max,maxVal);
		}
		return max;
	}

    
}

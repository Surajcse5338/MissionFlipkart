public class MaxCircularSubArraySum{
	public static void main(String[] args){
		int[] A = {8,-4,3,-5,4};
		int len=A.length;
		int finalMax=Integer.MIN_VALUE;
		for(int i=0;i<len;i++){
			int tempMax=A[i];
			int max=Integer.MIN_VALUE;
			for(int j=i+1;j<len+i;j++){
			    tempMax=Math.max(A[j%len]+tempMax,A[j%len]);
				max=Math.max(max,tempMax);
				System.out.println(tempMax+" "+max);
			}
			//System.out.println(max);
			finalMax=Math.max(finalMax,max);
			//System.out.println(finalMax);

		}
		//System.out.println(finalMax);


	}


}

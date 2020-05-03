public class MaxCircularSubArraySum{
	public static void main(String[] args){
		int[] A = {8,-4,3,-5,4};
		int len=A.length;
		int asnw1 = method1(A,len);
		int answ2 = method2(A,len);
		int answ3 = method3(A,len);
		System.out.println(answ1+" "+answ2+" "+answ3);
	}
	
	private static int method1(int[] A,int len){
		
		int finalMax=Integer.MIN_VALUE;
		for(int i=0;i<len;i++){
			int tempMax=A[i];
			int max=Integer.MIN_VALUE;
			for(int j=i+1;j<len+i;j++){
			    tempMax=Math.max(A[j%len]+tempMax,A[j%len]);
				max=Math.max(max,tempMax);
				//System.out.println(tempMax+" "+max);
			}
			//System.out.println(max);
			finalMax=Math.max(finalMax,max);
			//System.out.println(finalMax);

		}
		return finalMax;
	}
	private static int method2(int[] A,int len){
		int res=A[0];
		for(int i=0;i<len;i++){
			int max=A[i];
			int sum=max;
			for(int j=1;j<len;j++){
				sum=sum+A[(i+j)%len];
				max=Math.max(max,sum);

			}
			res=Math.max(max,res);
		}
		return res;
	}
	private static int methode3(int[] A, int len){
		//int len=A.length;
		int arraySum=0;
		for(int i=0;i<len;i++){
			arraySum=arraySum+A[i];
		}
		int minSum=A[0];
		int tempSum=minSum;
		for(int j=1;j<len;j++){
			tempSum=Math.min(tempSum+A[j],A[j]);
			minSum=Math.min(tempSum,minSum);
		}
		return (arraySum- minSum);
	}


}

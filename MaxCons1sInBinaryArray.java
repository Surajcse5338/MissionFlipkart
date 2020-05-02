public class MaxCons1sInBinaryArray{
	public static void main(String[] args){

		int[] A={0,0,0,0};
		int max=0;
		int i=0;
		int len=A.length;
		while(i<len){
			int j=i;
			int temp=0;
			while(j<len){
				if(A[j]==1){
					temp++;
					j++;
					if(temp>=max){
						max=temp;
					}
				}
				else{
					j++;
					break;
				}
			}
			i=j;
		}
		System.out.println(max);
		
	}


}

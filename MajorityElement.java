public class MajorityElement{
	public static void main(String[] args){
		int[] A = {4,7,4,7,4,7,4,7,7};
		int count=0;
		Integer candidateElement=null;
		for(int i=0;i<A.length;i++){
			if(count==0){
				candidateElement=A[i];
				count++;
				continue;
			}
			else{
				if(candidateElement==A[i]){
					count++;
				}
				else{
					
					count--;
				}
			}
		}
		int tempVar=0;
		int i=0;
		if(count>0){
			for(;i<A.length;i++){

				if(A[i]==candidateElement){
					tempVar++;
				}
			}
			if(tempVar>A.length/2){
				System.out.println(tempVar);
			}
		}

	}


}

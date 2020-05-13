public class MaxNoOfPiecesRecursive{
	public static void main(String[] args){
		int n=23;
		int a=12;
		int b=11;
		int c=9;
		int res=fun(n,a,b,c);
		System.out.println(res);
	}
	static int fun(int n,int a,int b,int c){

		if(n==0){
			return 0;
		}
		if(n<0){
			return -1;
		}

		int x=fun(n-a,a,b,c);
		int y=fun(n-b,a,b,c);
		int z=fun(n-c,a,b,c);
		int max=Integer.MIN_VALUE;
		if(x>=y && x>=z){
			max=x;
		}
		else if(y>=x && y>=z){
			max=y;
		}
		else{
			max=z;
		}

		if(max==-1){
			return -1;
		}
		else{
			return max+1;
		}
	}
}

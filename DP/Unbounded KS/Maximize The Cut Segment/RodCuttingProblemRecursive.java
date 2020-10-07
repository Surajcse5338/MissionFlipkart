import java.util.*;
import java.lang.*;
import java.io.*;
class RodCuttingProblemRecursive		// It will have runtime error of time limit exceeded.
						// So we have to slove this using dynamic programming.
 {
	public static void main (String[] args)
	 {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        int N=sc.nextInt();
	        int[] val=new int[3];
	        for(int i=0;i<3;i++){
	            val[i]=sc.nextInt();
	        }
	        System.out.println(rc(N,val,val.length)); 
	    }
	 }
	 static int rc(int W, int[] val, int n){
	     if(W==0 || n==0){
	         return 0;
	     }
	     else if(val[n-1]<=W){
	         return Math.max(1+rc(W-val[n-1], val, n), rc(W, val, n-1));
	     }
	     else{
	         return rc(W,val,n-1);
	     }
	 }
}

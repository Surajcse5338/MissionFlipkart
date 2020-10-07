import java.util.*;
import java.lang.*;
import java.io.*;
class RodCuttingProblemDP
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
	     int[][] dp=new int[n+1][W+1];
	     for(int i=0;i<W+1;i++){
	         dp[0][i]=Integer.MIN_VALUE;
	     }
	     for(int j=0;j<n+1;j++){
	         dp[j][0]=0;
	     }
	     for(int i=1;i<n+1;i++){
	         for(int j=1;j<W+1;j++){
	             if(val[i-1]<=j){
	                 dp[i][j]=Math.max(1+dp[i][j-val[i-1]],dp[i-1][j]);
	             }
	             else{
	                 dp[i][j]=dp[i-1][j];
	             }
	         }
	     }
	     return dp[n][W];
	 }
}

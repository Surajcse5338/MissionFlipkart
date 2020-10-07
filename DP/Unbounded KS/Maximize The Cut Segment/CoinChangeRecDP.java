import java.util.*;
import java.lang.*;
import java.io.*;
class CoinChangeRec
 {
	public static void main (String[] args)
	 {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        int m=sc.nextInt();
          int n= sc.nextInt();
	        int[] S=new int[m];
	        for(int i=0;i<3;i++){
	            S[i]=sc.nextInt();
	        }
	        System.out.println(count(S, m, n)); 
	    }
	 }
static long count(int S[], int m, int n) 
    { 
        
        long[][] dp=new long[m+1][n+1];
        for(int i=0;i<n+1;i++){
            dp[0][i]=0;
        }
        for(int i=0;i<m+1;i++){
            dp[i][0]=1;
        }
        
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(S[i-1]<=j){
                    dp[i][j]=dp[i][j-S[i-1]]+dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[m][n];
    } 
}

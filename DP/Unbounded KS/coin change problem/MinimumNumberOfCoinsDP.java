//Given a value V and array coins[] of size M, the task is to make the change for V cents, 
//given that you have an infinite supply of each of coins{coins1, coins2, ..., coinsm} valued coins.
//Find the minimum number of coins to make the change. If not possible to make change then output -1
import java.util.*;
import java.lang.*;
import java.io.*;
class MinimumNumberOfCoinsDP
 {
	public static void main (String[] args)
	 {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        int m=sc.nextInt();
          	int V= sc.nextInt();
	        int[] coins=new int[m];
	        for(int i=0;i<3;i++){
	            S[i]=sc.nextInt();
	        }
	        System.out.println(minCoins(coins, m, V)); 
	    }
	 }
	static int minCoins(int coins[], int M, int V) 
	{ 
	    
	    int[][] dp=new int[M+1][V+1];
	    for(int i=0;i<M+1;i++){
	        dp[i][0]=0;
	    }
	    for(int i=0;i<V+1;i++){
	        dp[0][i]=Integer.MAX_VALUE-1;
	    }
	    
	    for(int i=1;i<V+1;i++){
	        if(i%coins[0]==0){
	            dp[1][i]=i/coins[0];
	        }
	        else{
	            dp[1][i]=Integer.MAX_VALUE-1;
	        }
	    }
	    
	    for(int i=2;i<M+1;i++){
	        for(int j=1;j<V+1;j++){
	            if(coins[i-1]<=j){
	                dp[i][j]=Math.min(1+dp[i][j-coins[i-1]],dp[i-1][j]);
	            }
	            else{
	                dp[i][j]=dp[i-1][j];
	            }
	        }
	    }
	    if(dp[M][V]==Integer.MAX_VALUE-1){
	        return -1;
	    }
	    else{
	        return dp[M][V];
	    }
	} 
}
}

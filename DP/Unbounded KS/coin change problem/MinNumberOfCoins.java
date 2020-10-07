class Solution{

	public int minCoins(int coins[], int M, int V) 
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
	    
	   // for(int i=0;i<M+1;i++){
	   //     for(int j=0;j<V+1;j++){
	   //         System.out.print(dp[i][j]+"     ");
	   //     }
	   //     System.out.println(" ");
	   // }
	    
	    if(dp[M][V]==Integer.MAX_VALUE-1){
	        return -1;
	    }
	    else{
	        return dp[M][V];
	    }
	    
	    
	   // if(V==0){
	   //     return 0;
	   // }
	   // if(M==0){
	   //     return Integer.MAX_VALUE-1;
	   // }
	    
	   // if(coins[M-1]<=V){
	   //     return Math.min(1+minCoins(coins, M, V-coins[M-1]),
	   //     minCoins(coins, M-1, V));
	   // }
	   // else{
	   //     return minCoins(coins,M-1,V);
	   // }
	    
	} 
}

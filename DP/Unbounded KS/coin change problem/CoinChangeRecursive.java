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
        if(n==0){
            return 1;
        }
        if(m==0){
            return 0;
        }
        if(S[m-1]<=n){
            return (count(S, m , n-S[m-1])+count(S,m-1,n));
        }
        else{
            return count(S,m-1,n);
        }
    } 
}

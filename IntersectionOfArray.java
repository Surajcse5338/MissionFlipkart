import java.util.*;
public class IntersectionOfArray{
	public static void main(String[] args){
		
		int[] a={10,20,30,40,10,20,30};
		int[] b={10,33,22,11,30};
		int l1=a.length;
		int l2=b.length;
		int res=intersection(a,b,l1,l2);
		System.out.println(res);
	}
	public static int intersection(int[] a, int[] b, int l1, int l2){
		int res=0;
		for(int i=0;i<l1;i++){
			boolean flag=false;
			for(int j=i-1;j>=0;j--){
				if(a[j]==a[i]){
					flag=true;
				}
			}
			if(flag==true){
				continue;
			}
			for(int k=0;k<l2;k++){
				if(a[i]==b[k]){
					res++;
					break;
				}
			}

		}
		return res;
	}
}

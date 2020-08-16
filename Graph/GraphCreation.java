import java.util.*;
public class GraphCreation{
	
	public static void main(String[] args) {
		int u=4;
		ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
		
		for(int i=0;i<u;i++){
			adj.add(new ArrayList<Integer>());
		}

		addEdge(adj,0,1);
		addEdge(adj,0,2);
		addEdge(adj,1,2);
		addEdge(adj,1,3);

		for(int i=0;i<u;i++){
			System.out.print(i+"-");
			for(int j=0;j<adj.get(i).size();j++){
				System.out.print(adj.get(i).get(j)+" ");
			}
			System.out.println(" ");
		}
	}

	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u,int v){
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
}


	

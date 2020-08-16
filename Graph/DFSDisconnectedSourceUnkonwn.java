import java.util.*;
public class DFSDisconnectedSourceUnkonwn{
	
	public static void main(String[] args) {
		int v=7;
		ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
		
		for(int i=0;i<v;i++){
			adj.add(new ArrayList<Integer>());
		}
		addEdge(adj,0,1);
		addEdge(adj,0,2);
		addEdge(adj,1,4);
		addEdge(adj,3,1);
		addEdge(adj,3,2);
		addEdge(adj,4,3);
		addEdge(adj,5,6);

		for(int i=0;i<v;i++){
			System.out.print(i+"-");
			for(int j=0;j<adj.get(i).size();j++){
				System.out.print(adj.get(i).get(j)+" ");
			}
			System.out.println(" ");
		}

		DFS(adj,v);
		System.out.println(" ");

		
	}
	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u,int v){
		adj.get(u).add(v);
		adj.get(v).add(u);
	}

	static void DFS(ArrayList<ArrayList<Integer>> adj, int v){
		boolean[] visited=new boolean[v];
		for(int i=0;i<v;i++){
			if(visited[i]==false){
				DFSRec(adj,i,visited);	
			}
			
		}
		
	}

	static void DFSRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited){
		visited[s]=true;
		System.out.print(s+" ");
		for(int i:adj.get(s)){
			if(visited[i]==false){
				DFSRec(adj, i, visited);
			}
		}
	}
}

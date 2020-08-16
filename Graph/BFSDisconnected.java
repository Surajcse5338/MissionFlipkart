import java.util.*;
public class Main{
	
	public static void main(String[] args) {
		int v=7;
		ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
		
		for(int i=0;i<v;i++){
			adj.add(new ArrayList<Integer>());
		}
		addEdge(adj,0,1);
		addEdge(adj,0,2);
		addEdge(adj,1,3);
		addEdge(adj,2,3);
		addEdge(adj,4,5);
		addEdge(adj,4,6);
		addEdge(adj,5,6);

		BFSDis(adj,v);

		// for(int i=0;i<u;i++){
		// 	System.out.print(i+"-");
		// 	for(int j=0;j<adj.get(i).size();j++){
		// 		System.out.print(adj.get(i).get(j)+" ");
		// 	}
		// 	System.out.println(" ");
		// }
	}
	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u,int v){
		adj.get(u).add(v);
		adj.get(v).add(u);
	}

	static void BFSDis(ArrayList<ArrayList<Integer>> adj, int v){

		boolean[] visited=new boolean[v];
		for(int i=0;i<v;i++){
			if(visited[i]==false){
				visited[i]=true;
				BFS(adj,i,visited);
			}
		}
	}

	static void BFS(ArrayList<ArrayList<Integer>> adj,int i, boolean[] visited){
		Queue<Integer> q=new LinkedList<>();
		q.add(i);
		while(!q.isEmpty()){
			int val=q.poll();
			System.out.print(val+" ");
			for(int j:adj.get(val)){
				if(visited[j]!=true){
					visited[j]=true;
					q.add(j);
				}
			}
		}
	}	
}

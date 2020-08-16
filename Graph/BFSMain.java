import java.util.*;
public class BFSMain{
	
	public static void main(String[] args) {
		int u=5;
		ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
		
		for(int i=0;i<u;i++){
			adj.add(new ArrayList<Integer>());
		}
		addEdge(adj,0,1);
		addEdge(adj,0,2);
		addEdge(adj,1,2);
		addEdge(adj,1,3);
		addEdge(adj,2,3);
		addEdge(adj,3,4);
		addEdge(adj,2,4);

		BFS(adj,u,0);

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

	static void BFS(ArrayList<ArrayList<Integer>> adj, int u,int s){
		Queue<Integer> q=new LinkedList<>();
		boolean[] visited=new boolean[u];
		q.add(s);
		visited[s]=true;
		//System.out.print(s+" ");
		while(!q.isEmpty()){
			int val=q.poll();
			System.out.print(val+" ");
			for(int i:adj.get(val)){
				if(visited[i]==false){
					visited[i]=true;
				 	q.add(i);
				}
			}
			
		}
	}
}

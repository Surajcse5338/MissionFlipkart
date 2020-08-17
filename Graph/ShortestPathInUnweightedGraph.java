// Shortest Path In Unweighted Graph.

import java.util.*;
public class ShortestPathInUnweightedGraph{
	
	public static void main(String[] args) {
		int u=6;
		ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
		int path[]=new int[u];
		for(int i=0;i<u;i++){
			adj.add(new ArrayList<Integer>());
		}

		addEdge(adj,0,1);
		addEdge(adj,0,2);
		addEdge(adj,0,4);
		addEdge(adj,1,3);
		addEdge(adj,2,3);
		addEdge(adj,2,4);
		addEdge(adj,4,5);
		addEdge(adj,3,5);


		for(int i=0;i<u;i++){
			System.out.print(i+"-");
			for(int j=0;j<adj.get(i).size();j++){
				System.out.print(adj.get(i).get(j)+" ");
			}
			System.out.println(" ");
		}

		int[] answ=shortestPath(adj, 0, path);
		for(int i:answ){
			System.out.print(i+" ");
		}


	}

	static int[] shortestPath(ArrayList<ArrayList<Integer>> adj, int s, int[] path){
		
		boolean[] visited=new boolean[6];
		Queue<Integer> q=new LinkedList<>();
		q.add(s);
		visited[s]=true;

		while(!q.isEmpty()){
			int val=q.poll();
			for(int i:adj.get(val)){
				if(visited[i]==false){
					path[i]=path[val]+1;
					visited[i]=true;
					q.add(i);
				}
			}
		}

		return path;

	}

	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u,int v){
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
}

package graph;

import java.util.*;

public class GraphDataStructure {
	public static class Graph
	{
		private int Vertices;
		private LinkedList<Integer>[] AdjacentListArray;
		public int getVertices() {
			return Vertices;
		}
		public LinkedList<Integer>[] getAdjacentListArray() {
			return AdjacentListArray;
		}
		public Graph(int v)
		{
			this.Vertices=v;
			this.AdjacentListArray=new LinkedList[v];			
			for(int i=0; i<v; i++)
			{
				this.AdjacentListArray[i]=new LinkedList<>();
			}
		}
		public void BFS(int src)
		{
			LinkedList<Integer> Queue = new LinkedList<>();
			boolean[] Visited = new boolean[this.Vertices];
			Visited[src]=true;
			Queue.add(src);
			while(Queue.size() != 0)
			{
				int current=Queue.poll();
				Print(current+"\t");
				Iterator<Integer> allAdjacents=this.AdjacentListArray[current].listIterator();
				while(allAdjacents.hasNext()) {
					int adjVertex=allAdjacents.next();
					if(!Visited[adjVertex])
					{
						Visited[adjVertex]=true;
						Queue.add(adjVertex);
					}
				}
			}
		}
	}
	public static <T> void Print(T msg)
	{
		System.out.print(msg);
	}
	public static <T> void PrintLn(T msg)
	{
		System.out.println(msg);
	}
	public static void AddEdge(Graph g, int src, int dest)
	{
		g.getAdjacentListArray()[src].add(dest);
		//g.getAdjacentListArray()[dest].add(src); //Considering undirected graph **comment for directed graph**
	}
	public static void PrintGraph(Graph g)
	{
		for(int i=0; i<g.getVertices(); i++)
		{
			Print(i+" --> ");
			for(int adj: g.getAdjacentListArray()[i])
			{
				Print(adj+", ");
			}
			Print("\n");
		}
	}
	public static void main(String args[])
	{
		/*
		 * int V = 5; Graph graph = new Graph(V); AddEdge(graph, 0, 1); AddEdge(graph,
		 * 0, 4); AddEdge(graph, 1, 2); AddEdge(graph, 1, 3); AddEdge(graph, 1, 4);
		 * AddEdge(graph, 2, 3); AddEdge(graph, 3, 4);
		 * 
		 * PrintGraph(graph);
		 */
		Graph g = new Graph(4); 
        AddEdge(g,0, 1); 
        AddEdge(g,0, 2); 
        AddEdge(g,1, 2); 
        AddEdge(g,2, 0); 
        AddEdge(g,2, 3); 
        AddEdge(g,3, 3);
        int source=2;
        System.out.println("Following is Breadth First Traversal (starting from vertex "+source+")"); 
        g.BFS(source); 
	}
}

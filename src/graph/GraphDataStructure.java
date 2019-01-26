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
		g.getAdjacentListArray()[dest].add(src);
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
		int V = 5; 
        Graph graph = new Graph(V); 
        AddEdge(graph, 0, 1); 
        AddEdge(graph, 0, 4); 
        AddEdge(graph, 1, 2); 
        AddEdge(graph, 1, 3); 
        AddEdge(graph, 1, 4); 
        AddEdge(graph, 2, 3); 
        AddEdge(graph, 3, 4); 
       
        PrintGraph(graph); 
	}
}

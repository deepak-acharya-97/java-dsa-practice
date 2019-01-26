package graph;

import java.util.*;

public class GraphDataStructure {
	public class Graph
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
}

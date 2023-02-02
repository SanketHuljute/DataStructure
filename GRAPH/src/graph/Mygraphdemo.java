package graph;

public class Mygraphdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGraph g=new MyGraph(4);
		g.acceptGraph();
		System.out.println("Graph is");
		g.displayGraph();
		g.DFS(0);
		g.BFS(0);
	}

}

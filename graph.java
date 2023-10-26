import java.util.ArrayList;

public class graph {
    static class edge {
        int src;
        int dest;
        int wt;

        public edge(int e, int d, int w) {
            this.src = e;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void CreatGraph(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<edge>();
        }
        graph[0].add(new edge(0, 2, 2));
        graph[1].add(new edge(0, 2, 10));
        graph[1].add(new edge(0, 3, 9));
        graph[2].add(new edge(0, 3, 6));
        graph[2].add(new edge(0, 1, 2));
        graph[2].add(new edge(0, 0, 2));
        graph[3].add(new edge(0, 4, 2));
        graph[3].add(new edge(0, 1, 11));
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<edge> graph[] = new ArrayList[v];
        CreatGraph(graph);
        for (int i = 0; i < graph[i].size(); i++) {
            edge e = graph[i].get(i);
            System.out.println(e.dest + "," + e.wt);
        }
    }
}

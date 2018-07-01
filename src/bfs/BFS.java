package bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Abdullah Al Amin on 4/19/2018.
 */
public class BFS {
    public static void bfs(Vertex root){
        Queue<Vertex> queue = new LinkedList<>();

        root.setVisited(true);
        queue.add(root);

        while (! queue.isEmpty()){
            Vertex actual = queue.remove();
            System.out.println(actual+" ");
            for (Vertex v:
                 actual.getNeighbourList()) {
                if (!v.isVisited()){
                    v.setVisited(true);
                    queue.add(v);
                }
            }
        }
    }
}

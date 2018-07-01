package bfs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abdullah Al Amin on 4/19/2018.
 */
public class Vertex {
   private int data;
   private boolean visited;
   private List<Vertex> neighbourList;

    public Vertex(int data) {
        this.data = data;
        neighbourList = new ArrayList<>();
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeighbourList() {
        return neighbourList;
    }

    public void setNeighbourList(List<Vertex> neighbourList) {
        this.neighbourList = neighbourList;
    }

    public void addNeighbourVertex(Vertex v){
        this.neighbourList.add(v);
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "data=" + data +
                '}';
    }
}

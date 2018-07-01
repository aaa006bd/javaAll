package bfs;

/**
 * Created by Abdullah Al Amin on 4/19/2018.
 */
public class Demo {

    public static void main(String[] args) {
        Vertex one = new Vertex(1);
        Vertex two = new Vertex(2);
        Vertex three = new Vertex(3);
        Vertex four = new Vertex(4);
        Vertex five = new Vertex(5);

        one.addNeighbourVertex(two);
        one.addNeighbourVertex(three);
        two.addNeighbourVertex(five);
        three.addNeighbourVertex(four);

        BFS.bfs(one);
    }

}

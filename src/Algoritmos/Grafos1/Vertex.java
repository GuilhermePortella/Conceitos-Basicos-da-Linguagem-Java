package Algoritmos.Grafos1;

/**
 *
 * @author Guilherme
 */
public class Vertex {
    
    public char label;
    public boolean wasVisited;

    public Vertex(char lab) {
        label = lab;
        wasVisited = false;
    }
}
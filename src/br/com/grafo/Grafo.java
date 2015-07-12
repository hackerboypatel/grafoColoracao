package br.com.grafo;

import java.util.ArrayList;

/**
 *
 * @author '-Maxsuel
 */
public class Grafo {

    private ArrayList<Vertice> vertices;
    private ArrayList<Aresta> arestas;
    private boolean orientado;

    public Grafo() {
        this.vertices = new ArrayList<Vertice>();
        this.arestas = new ArrayList<Aresta>();
    }

    public ArrayList<Vertice> getVertices() {
        return vertices;
    }

    public void setVertices(ArrayList<Vertice> vertices) {
        this.vertices = vertices;
    }

    public ArrayList<Aresta> getArestas() {
        return arestas;
    }

    public void setArestas(ArrayList<Aresta> arestas) {
        this.arestas = arestas;
    }

    public boolean isOrientado() {
        return orientado;
    }

    public void setOrientado(boolean orientado) {
        this.orientado = orientado;
    }

}

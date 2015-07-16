package br.com.grafo;

import java.util.Scanner;

/**
 *
 * @author '-Maxsuel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Grafo grafo = new Grafo();
        Aresta aresta = new Aresta();
        Vertice vertice = new Vertice();
        
        grafo.setOrientado(false); //grafo orientado?
        
        
        System.out.print("Hello World. Grafo.");
    }
    
}

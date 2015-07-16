package br.com.grafo;

import java.util.Scanner;

/**
 *
 * @author '-Maxsuel
 */
public class Main {
    private static final Scanner ler = new Scanner(System.in);
    private static final Grafo grafo = new Grafo();
    private static final Aresta aresta = new Aresta();
    private static final Vertice vertice = new Vertice();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcao;
        grafo.setOrientado(false); //grafo orientado?

        do {
            menu();
            opcao = ler.nextInt();
            switch(opcao){
                case 1:
                    inserirVertice();
                    break;
                case 2:
                    inserirAresta();
                    break;
                case 3:
                    grafo.colorirGrafo(grafo);
                    break;
                case 4:
                    povoarGrafo();
                    break;
                case 5:
                    //grafo.imprimirGrafo(); --implementar.
                    break;
                default:
            }
        } while (opcao != 0);
            
        System.out.println("Até mais.");
    }
    public static void menu(){
        System.out.println("\tGRAFO");
        System.out.println("0. Fim");
        System.out.println("1. Inserir vertices");
        System.out.println("2. Inserir aresta");
        System.out.println("3. Colorir");
        System.out.println("4. Povoar grafo (povoar.txt)");
        System.out.println("5. Imprimir Grafo");
        System.out.println("Opcao:");
    }

    private static void inserirVertice() {
        System.out.print("Rotulo: ");
        int addVertice = ler.nextInt();
        if(grafo.inserirVertice(addVertice))
            System.out.println("Vertice adicionado.");
        else
            System.out.println("Erro.");
    }


    private static void inserirAresta() {
    }

    private static void povoarGrafo() {
    }
    
    

}

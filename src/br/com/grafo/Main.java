package br.com.grafo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author '-Maxsuel
 */
public class Main {

    private static final Scanner ler = new Scanner(System.in);
    private static final Grafo grafo = new Grafo();

    public static void menu() {
        System.out.println("\tGRAFO");
        System.out.println("0. Fim");
        System.out.println("1. Inserir vertices");
        System.out.println("2. Inserir aresta");
        System.out.println("3. Colorir");
        System.out.println("4. Povoar grafo (povoar.txt)");
        System.out.println("5. Imprimir Grafo");
        System.out.println("Opcao:");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcao;
        grafo.setOrientado(false); //grafo orientado?

        do {
            menu();
            opcao = ler.nextInt();
            switch (opcao) {
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
                    grafo.imprimirGrafo();
                    break;
                default:
            }
        } while (opcao != 0);

        System.out.println("Até mais.");
    }


    private static void inserirVertice() {
        System.out.print("Rotulo: ");
        int addVertice = ler.nextInt();
        if (grafo.inserirVertice(addVertice)) {
            System.out.println("Vertice adicionado.");
        } else {
            System.out.println("Erro.");
        }
    }

    private static void inserirAresta() {
        System.out.print("Aresta: ");
        int a1 = ler.nextInt();
        System.out.print("Aresta: ");
        int a2 = ler.nextInt();
        System.out.print("Peso: ");
        int peso = ler.nextInt();

        if (grafo.inserirAresta(a1, a2, peso)) {
            System.out.println("Aresta adicionada.");
        } else {
            System.out.println("Erro.");
        }
    }

    private static void povoarGrafo() {
        ArrayList<String> dados = new ArrayList<>();
        String linha;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("povoar.txt"));
            StringTokenizer dado = null;

            while ((linha = reader.readLine()) != null) {
                dado = new StringTokenizer(linha, "-> :");
                while (dado.hasMoreTokens()) {
                    dados.add(dado.nextToken());
                }
            }
            reader.close();

            if (dados.get(0).equals("0")) {
                grafo.setOrientado(false);
            } else {
                if (dados.get(0).equals("1")) {
                    grafo.setOrientado(true);
                }
            }
            for (int i = 1; i < (dados.size()); i = i + 3) {
                grafo.inserirVertice(Integer.parseInt(dados.get(i)));
            }
            for (int i = 2; i < (dados.size()); i = i + 3) {
                grafo.inserirVertice(Integer.parseInt(dados.get(i)));
            }
            for (int i = 1; i < (dados.size()); i = i + 3) {
                grafo.inserirAresta(Integer.parseInt(dados.get(i)), Integer.parseInt(dados.get(i + 1)), Integer.parseInt(dados.get(i + 2)));
            }

        } catch (IOException | NumberFormatException e) {
        }
    }
}

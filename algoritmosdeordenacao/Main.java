package algoritmosdeordenacao;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        GeraNumerosAleatorios gna = new GeraNumerosAleatorios();

        ArrayList<int[]> vetores = new ArrayList<>();
        vetores.add(gna.geraNumerosAleatorios(100));
        vetores.add(gna.geraNumerosAleatorios(1000));
        vetores.add(gna.geraNumerosAleatorios(10000));
        vetores.add(gna.geraNumerosAleatorios(100000));
        // vetores.add(gna.geraNumerosAleatorios(1000000));

        exibeCiclosPorAlgoritmoPorVetor("BubbleSort", vetores);
        exibeCiclosPorAlgoritmoPorVetor("InsertionSort", vetores);
        exibeCiclosPorAlgoritmoPorVetor("SelectionSort", vetores);
    }

    public static void exibeCiclosPorAlgoritmoPorVetor(String tipoAlgoritmo, ArrayList<int[]> vetores) {
        AlgoritmoOrdenacaoFactory algoritmoFactory = new AlgoritmoOrdenacaoFactory();
        for (int[] vetor : vetores) {
            AlgoritmoOrdenacao algoritmo = algoritmoFactory.criaAlgoritmo(tipoAlgoritmo);
            algoritmo.setVetor(vetor);
            algoritmo.sort();
            System.out.printf("%s: %d - %d\n", tipoAlgoritmo, vetor.length, algoritmo.getCiclos());
        }
        System.out.println();
    }

}
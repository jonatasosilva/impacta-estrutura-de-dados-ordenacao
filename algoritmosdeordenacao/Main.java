package algoritmosdeordenacao;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<int[]> vetores = new ArrayList<>();
        for (int i = 100; i <= 100000; i *= 10) { // TODO: mudar para 1 milhão
            vetores.add(GeraNumerosAleatorios.gerar(i));
        }

        exibeCiclosPorAlgoritmoPorVetor("BubbleSort", vetores);
        exibeCiclosPorAlgoritmoPorVetor("InsertionSort", vetores);
        exibeCiclosPorAlgoritmoPorVetor("SelectionSort", vetores);
        exibeCiclosPorAlgoritmoPorVetor("MergeSort", vetores);
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
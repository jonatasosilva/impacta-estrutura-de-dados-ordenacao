package algoritmosdeordenacao;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        GeraNumerosAleatorios gna = new GeraNumerosAleatorios();

        ArrayList<int[]> vetores = new ArrayList<>();
        for (int i = 100; i <= 100000; i *= 10) { // TODO: mudar para 1 milhão
            vetores.add(gna.geraNumerosAleatorios(i));
        }

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
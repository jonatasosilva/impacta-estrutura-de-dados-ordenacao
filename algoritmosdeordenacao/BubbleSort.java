package algoritmosdeordenacao;

public class BubbleSort {

    public static int sort(int[] vetor) {
        int aux;
        int ciclos = 0;
        for (int i = 0; i < vetor.length; i++) {
            ciclos++;
            for (int j = i + 1; j < vetor.length; j++) {
                ciclos++;
                if (vetor[i] > vetor[j]) {
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;

                }
            }
        }
        return ciclos;
    }
}

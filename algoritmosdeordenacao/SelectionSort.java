
package algoritmosdeordenacao;

public class SelectionSort {
    public static int sort(int[] vetor) {
        int ciclos = 0;
        int posicao_menor, aux;
        for (int i = 0; i < vetor.length; i++) {
            ciclos++;
            posicao_menor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                ciclos++;
                if (vetor[j] < vetor[posicao_menor]) {
                    posicao_menor = j;
                }
            }
            aux = vetor[posicao_menor];
            vetor[posicao_menor] = vetor[i];
            vetor[i] = aux;
            ciclos++;
        }
        return ciclos;
    }
}

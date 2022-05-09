package algoritmosdeordenacao;

public class InsertionSort implements AlgoritmoOrdenacao {

    public int sort(int[] vetor) {
        int ciclos = 0;
        int aux, j;
        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            ciclos++;
            while (j >= 0 && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                j--;
                ciclos++;
            }
            vetor[j + 1] = aux;
        }
        return ciclos;
    }

}

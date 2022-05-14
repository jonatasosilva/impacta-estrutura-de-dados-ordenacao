package algoritmosdeordenacao;

public class QuickSort extends AlgoritmoOrdenacao {

    public void quick(int[] vetor, int esquerda, int direita) {

        if (esquerda < direita) {
            int p = particao(vetor, esquerda, direita);
            quick(vetor, esquerda, p);
            quick(vetor, p + 1, direita);
        }

    }

    private int particao(int[] vetor, int esquerda, int direita) {
        int meio = (int) (esquerda + direita) / 2;
        int pivot = vetor[meio];
        int i = esquerda - 1;
        int j = direita;
        while (true) {
            do {
                i++;
                this.ciclos += 1;
            } while (vetor[i] < pivot);
            do {
                j--;
            } while (vetor[j] > pivot);

            if (i >= j) {
                return j;
            }
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
            this.ciclos += 1;
        }
    }

    public void sort() {
        quick(this.vetor, 0, this.vetor.length - 1);
    }
}

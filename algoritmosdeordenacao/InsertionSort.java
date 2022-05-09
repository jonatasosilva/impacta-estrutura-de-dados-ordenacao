package algoritmosdeordenacao;

public class InsertionSort extends AlgoritmoOrdenacao {

    public void sort() {
        int aux, j;
        for (int i = 1; i < this.vetor.length; i++) {
            aux = this.vetor[i];
            j = i - 1;
            this.ciclos++;
            while (j >= 0 && this.vetor[j] > aux) {
                this.vetor[j + 1] = this.vetor[j];
                j--;
                this.ciclos++;
            }
            this.vetor[j + 1] = aux;
        }
    }

}

package algoritmosdeordenacao;

public class SelectionSort extends AlgoritmoOrdenacao {

    public void sort() {
        int posicao_menor, aux;
        for (int i = 0; i < this.vetor.length; i++) {
            this.ciclos++;
            posicao_menor = i;
            for (int j = i + 1; j < this.vetor.length; j++) {
                this.ciclos++;
                if (this.vetor[j] < this.vetor[posicao_menor]) {
                    posicao_menor = j;
                }
            }
            aux = this.vetor[posicao_menor];
            this.vetor[posicao_menor] = this.vetor[i];
            this.vetor[i] = aux;
        }
    }

}

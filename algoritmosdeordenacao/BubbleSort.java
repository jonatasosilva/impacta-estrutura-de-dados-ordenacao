package algoritmosdeordenacao;

public class BubbleSort extends AlgoritmoOrdenacao {

    public void sort() {
        int aux;
        for (int i = 0; i < this.vetor.length; i++) {
            this.ciclos++;
            for (int j = i + 1; j < this.vetor.length; j++) {
                this.ciclos++;
                if (this.vetor[i] > this.vetor[j]) {
                    aux = this.vetor[j];
                    this.vetor[j] = this.vetor[i];
                    this.vetor[i] = aux;
                }
            }
        }
    }

}

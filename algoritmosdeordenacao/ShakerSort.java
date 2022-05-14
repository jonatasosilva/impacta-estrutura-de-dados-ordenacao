package algoritmosdeordenacao;

public class ShakerSort extends AlgoritmoOrdenacao {

    private void shaker(int[] vetor) {
        for (int i = 0; i < vetor.length / 2; i++) {
            this.ciclos++;
            boolean troca = false;
            for (int j = i; j < vetor.length - i - 1; j++) {
                this.ciclos++;
                if (vetor[j] < vetor[j + 1]) {
                    int tmp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = tmp;
                    troca = true;
                }

            }

            for (int j = vetor.length - 2 - i; j > i; j--) {
                this.ciclos++;
                if (vetor[j] > vetor[j - 1]) {
                    int tmp = vetor[j];
                    vetor[j] = vetor[j - 1];
                    vetor[j - 1] = tmp;
                    troca = true;
                }
            }
            if (!troca)
                break;
        }
    }

    public void sort() {
        shaker(this.vetor);
    }
}
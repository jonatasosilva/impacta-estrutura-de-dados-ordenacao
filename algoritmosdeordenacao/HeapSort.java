package algoritmosdeordenacao;

public class HeapSort extends AlgoritmoOrdenacao {
    private void heapify(int[] array, int n, int i) {
        int maior = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && array[l] > array[maior]) {
            maior = l;
        }

        if (r < n && array[r] > array[maior]) {
            maior = r;
        }

        if (maior != i) {
            int swap = array[i];
            array[i] = array[maior];
            array[maior] = swap;
            heapify(array, n, maior);
        }
    }

    private void heapSort(int[] array) {
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            this.ciclos += 1;
            heapify(array, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            this.ciclos += 1;
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
    }

    public void sort() {
        heapSort(this.vetor);
    }
}

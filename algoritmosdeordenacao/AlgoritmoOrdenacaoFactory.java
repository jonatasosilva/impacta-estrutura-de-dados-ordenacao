package algoritmosdeordenacao;

public class AlgoritmoOrdenacaoFactory {

    public AlgoritmoOrdenacao criaAlgoritmo(String tipoAlgoritmo) {
        switch (tipoAlgoritmo) {
            case "BubbleSort":
                return new BubbleSort();
            case "InsertionSort":
                return new InsertionSort();
            case "SelectionSort":
                return new SelectionSort();
            case "MergeSort":
                return new MergeSort();
            case "HeapSort":
                return new HeapSort();
            case "QuickSort":
                return new QuickSort();
            case "ShakerSort":
                return new ShakerSort();
            default:
                throw new IllegalArgumentException("Algoritmo desconhecido");
        }
    }

}

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
            default:
                throw new IllegalArgumentException("Algoritmo desconhecido");
        }
    }

}

package algoritmosdeordenacao;

public class Main {

    public static void main(String[] args) {
        GeraNumerosAleatorios gna = new GeraNumerosAleatorios();

        int[][] listas = new int[4][];
        listas[0] = gna.geraNumerosAleatorios(100);
        listas[1] = gna.geraNumerosAleatorios(1000);
        listas[2] = gna.geraNumerosAleatorios(10000);
        listas[3] = gna.geraNumerosAleatorios(100000);
        // listas[4] = gna.geraNumerosAleatorios(1000000);

        exibeCiclosPorAlgoritmoPorVetor("BubbleSort", listas);
        exibeCiclosPorAlgoritmoPorVetor("InsertionSort", listas);
        exibeCiclosPorAlgoritmoPorVetor("SelectionSort", listas);
    }

    public static void exibeCiclosPorAlgoritmoPorVetor(String tipoAlgoritmo, int[][] vetores) {
        AlgoritmoOrdenacaoFactory algoritmoFactory = new AlgoritmoOrdenacaoFactory();
        AlgoritmoOrdenacao algoritmo = algoritmoFactory.criaAlgoritmo(tipoAlgoritmo);
        for (int[] vetor : vetores) {
            int ciclos = algoritmo.sort(vetor);
            System.out.printf("%s: %d - %d\n", tipoAlgoritmo, vetor.length, ciclos);
        }
        System.out.println();
    }

}
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

        for (int[] lista : listas) {
            System.out.println("BubbleSort " + lista.length + " " +
                    BubbleSort.sort(lista));
        }

        for (int[] lista : listas) {
            System.out.println("InsertionSort " + lista.length + " " +
                    InsertionSort.sort(lista));
        }

        for (int[] lista : listas) {
            System.out.println("SelectionSort " + lista.length + " " +
                    SelectionSort.sort(lista));
        }

    }
}

package algoritmosdeordenacao;

public class Main {
    public static void main(String[] args) {
        GeraNumerosAleatorios gna = new GeraNumerosAleatorios();
        int[] numerosAleatorios100 = gna.geraNumerosAleatorios(100);
        int[] numerosAleatorios1000 = gna.geraNumerosAleatorios(1000);
        int[] numerosAleatorios10000 = gna.geraNumerosAleatorios(10000);
        int[] numerosAleatorios100000 = gna.geraNumerosAleatorios(100000);
        // int[] numerosAleatorios1000000 = gna.geraNumerosAleatorios(1000000);

        int ciclosBubbleSort100 = BubbleSort.sort(numerosAleatorios100);
        System.out.println("Bubble 100 " + ciclosBubbleSort100);

        int ciclosBubbleSort1000 = BubbleSort.sort(numerosAleatorios1000);
        System.out.println("Bubble 1000 " + ciclosBubbleSort1000);

        int ciclosBubbleSort10000 = BubbleSort.sort(numerosAleatorios10000);
        System.out.println("Bubble 10000 " + ciclosBubbleSort10000);

        int ciclosBubbleSort100000 = BubbleSort.sort(numerosAleatorios100000);
        System.out.println("Bubble 100000 " + ciclosBubbleSort100000);

        /*
         * int ciclosBubbleSort1000000 = BubbleSort.sort(numerosAleatorios1000000);
         * System.out.println("Bubble 1000000 " + ciclosBubbleSort1000000);
         */

        int ciclosInsertionSort100 = InsertionSort.sort(numerosAleatorios100);
        System.out.println("insertion 100 " + ciclosInsertionSort100);

        int ciclosInsertionSort1000 = InsertionSort.sort(numerosAleatorios1000);
        System.out.println("insertion 1000 " + ciclosInsertionSort1000);

        int ciclosInsertionSort10000 = InsertionSort.sort(numerosAleatorios10000);
        System.out.println("insertion 10000 " + ciclosInsertionSort10000);

        int ciclosInsertionSort1000000 = InsertionSort.sort(numerosAleatorios100000);
        System.out.println("insertion 100000 " + ciclosInsertionSort1000000);

        /*
         * int ciclosInsertionSort1000000 =
         * InsertionSort.sort(numerosAleatorios1000000);
         * System.out.println("insertion 1000000 " + ciclosInsertionSort1000000);
         */

        int ciclosSelectionSort100 = SelectionSort.sort(numerosAleatorios100);
        System.out.println("Selection 100 " + ciclosSelectionSort100);

        int ciclosSelectionSort1000 = SelectionSort.sort(numerosAleatorios1000);
        System.out.println("Selection 1000 " + ciclosSelectionSort1000);

        int ciclosSelectionSort10000 = SelectionSort.sort(numerosAleatorios10000);
        System.out.println("Selection 10000 " + ciclosSelectionSort10000);

        int ciclosSelectionSort100000 = SelectionSort.sort(numerosAleatorios100000);
        System.out.println("Selection 100000 " + ciclosSelectionSort100000);

        // int ciclosSelectionSort1000000 =
        // SelectionSort.sort(numerosAleatorios1000000);
        // System.out.println("Selection 1000000 "+ ciclosSelectionSort1000000);

    }
}

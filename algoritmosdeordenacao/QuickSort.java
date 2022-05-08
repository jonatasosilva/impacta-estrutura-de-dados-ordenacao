
// package algoritmosdeordenacao;

// public class QuickSort {

// public static sort(int[] vetor, int esquerda, int direita) {
// int[] ciclos = 0;

// if (esquerda < direita) {
// int p = particao(vetor, esquerda, direita);
// sort(vetor, esquerda, p);
// sort(vetor, p + 1, direita);
// }
// return new Resultado(vetor, trocas);
// }

// private static int particao(int[] vetor, int esquerda, int direita) {
// int meio = (int) (esquerda + direita) / 2;
// int pivot = vetor[meio];
// int i = esquerda - 1;
// int j = direita;
// while (true) {
// do {i++;ciclos++;}
// while (vetor[i] < pivot);
// do {j--;} while (vetor[j] > pivot);

// if (i >= j) {
// return j;
// }
// int aux = vetor[i];
// vetor[i] = vetor[j];
// vetor[j] = aux;
// ciclos++;
// }
// }
// }

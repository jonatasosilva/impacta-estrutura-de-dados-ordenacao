package algoritmosdeordenacao;

import java.util.Random;

public class GeraNumerosAleatorios {

	public int[] geraNumerosAleatorios(int quantidade) {
		int[] numerosAleatorios = new int[quantidade];

		Random random = new Random();

		for (int i = 0; i < quantidade; i++) {
			numerosAleatorios[i] = random.nextInt(100);
		}

		return numerosAleatorios;
	}

}

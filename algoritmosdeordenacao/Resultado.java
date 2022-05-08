package algoritmosdeordenacao;

public class Resultado {
    private int[] vetor;
    private int ciclos;
    
    public Resultado(int[] vetor, int ciclos){
        this.vetor = vetor;
        this.ciclos = ciclos;
    }

    public int[] getVetor() {
        return vetor;
    }

    public int getCiclos() {
        return ciclos;
    }
    
    
}

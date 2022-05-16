package algoritmosdeordenacao;

abstract class AlgoritmoOrdenacao {

    protected long ciclos = 0;
    protected int[] vetor;

    abstract public void sort();

    public Long getCiclos() {
        return this.ciclos;
    }

    public int[] getVetor() {
        return this.vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor.clone();
    }

}

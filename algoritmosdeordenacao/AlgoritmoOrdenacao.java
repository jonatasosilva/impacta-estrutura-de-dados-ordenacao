package algoritmosdeordenacao;

abstract class AlgoritmoOrdenacao {

    protected int ciclos = 0;
    protected int[] vetor;

    abstract public void sort();

    public int getCiclos() {
        return this.ciclos;
    }

    public int[] getVetor() {
        return this.vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor.clone();
    }

}

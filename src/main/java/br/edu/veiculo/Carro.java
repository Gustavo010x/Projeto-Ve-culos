package br.edu.veiculo;

public class Carro extends veiculo {
    private int numeroPortas;

    public Carro(String marca, String modelo, int numeroPortas) {
        super(marca, modelo);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    @Override
    public void emitirSom() {
        System.out.println("O carro " + getModelo() + " faz Vruum!");
    }

    @Override
    public String toString() {
        return "Carro [marca=" + marca + ", modelo=" + modelo + ", numeroPortas=" + numeroPortas + "]";
    }
}
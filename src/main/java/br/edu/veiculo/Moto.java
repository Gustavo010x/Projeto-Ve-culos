package br.edu.veiculo;

public class Moto extends veiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public void emitirSom() {
        System.out.println("A moto " + getModelo() + " faz Vrum-vrum!");
    }

    @Override
    public String toString() {
        return "Moto [marca=" + marca + ", modelo=" + modelo + ", cilindrada=" + cilindrada + "]";
    }
}
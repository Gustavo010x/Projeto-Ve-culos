package br.edu.veiculo;


public abstract class veiculo {
    protected String marca;
    protected String modelo;

    public veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

   
    public void acelerar() {
        System.out.println("O veículo " + this.modelo + " está acelerando.");
    }


    public abstract void emitirSom();

    @Override
    public String toString() {
        return "Veiculo [marca=" + marca + ", modelo=" + modelo + "]";
    }
}
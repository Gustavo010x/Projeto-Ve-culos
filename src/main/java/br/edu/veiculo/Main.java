package br.edu.veiculo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criação de objetos das subclasses
        Carro meuCarro = new Carro("Ford", "Fusion", 4);
        Moto minhaMoto = new Moto("Honda", "CBR 600", 600);

        // Demonstração do polimorfismo: lista de Veículo
        List<veiculo> veiculos = new ArrayList<>();
        veiculos.add(meuCarro);
        veiculos.add(minhaMoto);

        System.out.println("--- Lista de Veículos ---");
        for (veiculo veiculo : veiculos) {
            System.out.println(veiculo.toString());
            veiculo.acelerar();
            veiculo.emitirSom();
            System.out.println("-------------------------");
        }
    }
}
package br.com.alura.PraticandoJAVA.Encapsulamento.metodos;

import java.time.LocalDate;

public class Carro {
    private String modelo;
    private String placa;
    private int ano;

    public Carro(String modelo, String placa, int ano){
        validarCarro(modelo, placa, ano);
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return """
                Veículo Cadastrado!
                Modelo: %s
                Placa: %s
                Ano: %d""".formatted(modelo, placa, ano);
    }

    private void validarCarro(String modelo, String placa, int ano){
        if(modelo == null || modelo.isBlank()){
            throw new IllegalArgumentException("Digite o modelo do carro.");
        }
        if(placa == null || placa.isBlank()){
            throw new IllegalArgumentException("Digite qual a placa do carro.");
        }
        if(ano < 1950 || ano > LocalDate.now().getYear()){
            throw new IllegalArgumentException("Digite o ano correto do carro.");
        }
    }
}

package br.com.alura.PraticandoJAVA.Condicionais.metodos;

public class Senha {
    private String senhaCorreta = "123456";

    public String verificarSenha(String tentativa){
        if(tentativa.equals(senhaCorreta)){
            return "Acesso liberado!";
        } else {
            return "Acesso negado.";
        }
    }
}

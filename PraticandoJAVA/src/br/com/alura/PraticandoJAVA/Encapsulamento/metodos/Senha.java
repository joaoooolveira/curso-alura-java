package br.com.alura.PraticandoJAVA.Encapsulamento.metodos;

public class Senha {
    private String senha;

    public Senha(String senha){
        if(senha == null || senha.isBlank()){
            throw new IllegalArgumentException("Insira uma senha.");
        }

        this.senha = senha;
    }

    public void alterarSenha(String senhaAtual, String novaSenha){
        if(senhaAtual == null || senhaAtual.isBlank()){
            throw new IllegalArgumentException("Insira a senha atual.");
        }
        
        if(senhaAtual.equals(this.senha)){
            if(novaSenha == null || novaSenha.isBlank()){
                throw new IllegalArgumentException("Insira a senha para alteração.");
            }

            this.senha = novaSenha;
            System.out.println("Senha alterada com sucesso!");
        } else {
            System.out.println("Senha antiga incorreta.");
        }
    }
}

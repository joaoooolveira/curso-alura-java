package br.com.alura.screenmatch.excecoes;

public class ErroDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;

    public ErroDeConversaoDeAnoException(String mensagemDeErro) {
        this.mensagem = mensagemDeErro;
    }

    public String getMensagem() {
        return this.mensagem;
    }
}

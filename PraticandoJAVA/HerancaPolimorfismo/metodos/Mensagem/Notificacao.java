package br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Mensagem;

public abstract class Notificacao {
    private String destinatario;
    private String mensagem;

    public Notificacao(String destinatario, String mensagem){
        if(destinatario == null || destinatario.isBlank()){
            throw new IllegalArgumentException("Insira o destinatário.");
        }
        if(mensagem == null || mensagem.isBlank()){
            throw new IllegalArgumentException("Não foi possível enviar a mensagem.");
        }

        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    public abstract void enviar();

    public String getDestinatario() {
        return destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }
}

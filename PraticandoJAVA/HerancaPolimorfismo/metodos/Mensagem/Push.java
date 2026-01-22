package br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Mensagem;

public class Push extends Notificacao{
    private String titulo;

    public Push(String destinatario, String titulo, String mensagem) {
        super(destinatario + "_app", mensagem);

        if(titulo == null || titulo.isBlank()){
            throw new IllegalArgumentException("Escreva o título da notificação");
        }

        this.titulo = titulo;
    }

    @Override
    public void enviar() {
        System.out.println("""
                Enviando push para: %s
                Título: %s
                Conteúdo: %s""".formatted(getDestinatario(), titulo, getMensagem()));
    }
}

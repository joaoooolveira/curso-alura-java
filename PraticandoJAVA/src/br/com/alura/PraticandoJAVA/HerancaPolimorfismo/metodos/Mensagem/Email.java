package br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Mensagem;

public class Email extends Notificacao{
    private String assunto;

    public Email(String destinatario, String assunto, String mensagem) {
        super(destinatario + "@exemplo.com", mensagem);

        if (assunto == null || assunto.isBlank()){
            throw new IllegalArgumentException("Digite o assunto desse e-mail.");
        }

        this.assunto = assunto;
    }

    @Override
    public void enviar() {
        System.out.println("""
                Email: %s
                Assunto: %s
                Corpo: %s""".formatted(getDestinatario(), assunto, getMensagem()));
    }
}

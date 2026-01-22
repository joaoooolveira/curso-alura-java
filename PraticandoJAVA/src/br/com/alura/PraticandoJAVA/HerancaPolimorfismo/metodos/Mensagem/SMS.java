package br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Mensagem;

public class SMS extends Notificacao{
    private String numero;

    public SMS(String numero, String mensagem) {
        super(numero, mensagem);

        String numeroLimpo = numero.replaceAll("\\D", "");
        if(numeroLimpo.length() != 11){
            throw new IllegalArgumentException("Digite um número válido.");
        }
    }

    @Override
    public void enviar() {
        System.out.println("""
                Enviando SMS para: %s
                Mensagem: %s""".formatted(numero, getMensagem()));
    }
}
